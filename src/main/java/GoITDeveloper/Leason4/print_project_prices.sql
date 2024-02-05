SELECT c.ID                                                                 AS client_id,
       c.NAME                                                               AS client_name,
       p.ID                                                                 AS project_id,
       p.START_DATE,
       p.FINISH_DATE,
       DATE_PART('day', p.FINISH_DATE::timestamp - p.START_DATE::timestamp) AS days_duration
FROM client c
         JOIN
     project p ON c.ID = p.CLIENT_ID;


-- £££££££££

SELECT
    p.CLIENT_ID,
       p.PROJECT_NAME,
       c.name,
       EXTRACT(MONTH FROM AGE(p.FINISH_DATE, p.START_DATE)) * SUM(w.SALARY) AS PROJECT_COST
FROM project p
         JOIN
     client c ON p.CLIENT_ID = c.ID
         JOIN
     project_worker pw ON p.CLIENT_ID = pw.PROJECT_ID
         JOIN
     worker w ON pw.WORKER_ID = w.ID
GROUP BY  c.NAME, p.PROJECT_NAME, p.START_DATE, p.FINISH_DATE, p.CLIENT_ID
ORDER BY PROJECT_COST DESC;

SELECT p.PROJECT_ID, w.ID
FROM project_worker p
         CROSS JOIN worker w;

SELECT p.PROJECT_NAME, w.NAME , w.salary
FROM project p
         CROSS JOIN worker w
         JOIN project pr ON p.CLIENT_ID = pr.ID;

SELECT p.PROJECT_NAME, w.NAME, w.salary
FROM project p
          JOIN project_worker pw ON p.ID = pw.PROJECT_ID
          JOIN worker w ON pw.WORKER_ID = w.ID;




