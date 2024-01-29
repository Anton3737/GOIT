WITH ProjectCost AS (SELECT p.ID                                                 AS PROJECT_ID,
                            SUM(w.SALARY)                                        AS WORKER_COST,
                            EXTRACT(MONTH FROM AGE(p.FINISH_DATE, p.START_DATE)) AS DURATION_MONTHS
                     FROM project p
                              JOIN project_worker pw ON p.ID = pw.PROJECT_ID
                              JOIN worker w ON pw.WORKER_ID = w.ID
                     GROUP BY p.ID, p.START_DATE, p.FINISH_DATE)
SELECT p.ID                                AS PROJECT_ID,
       pc.DURATION_MONTHS,
       pc.WORKER_COST * pc.DURATION_MONTHS AS PROJECT_COST
FROM project p
         JOIN ProjectCost pc ON p.ID = pc.PROJECT_ID;