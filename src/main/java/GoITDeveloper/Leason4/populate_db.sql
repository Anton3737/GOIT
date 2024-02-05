-- Заповнення таблиць даними
INSERT INTO worker
    (NAME, BIRTHDAY, LEVEL, SALARY)
VALUES ('Іван Петренко', TO_DATE('1990-05-15', 'YYYY-MM-DD'), 'Middle', 80000),
       ('Олена Коваленко', TO_DATE('1985-09-22', 'YYYY-MM-DD'), 'Senior', 95000),
       ('Марія Лисенко', TO_DATE('1993-11-10', 'YYYY-MM-DD'), 'Trainee', 60000),
       ('Богдан Шевченко', TO_DATE('1982-03-30', 'YYYY-MM-DD'), 'Junior', 75000),
       ('Єва Біла', TO_DATE('1995-07-08', 'YYYY-MM-DD'), 'Senior', 90000),
       ('Олександр Бровко', TO_DATE('1988-01-18', 'YYYY-MM-DD'), 'Senior', 100000),
       ('Лаура Дейвіс', TO_DATE('1991-12-05', 'YYYY-MM-DD'), 'Trainee', 55000),
       ('Марк Тейлор', TO_DATE('1987-06-25', 'YYYY-MM-DD'), 'Junior', 72000),
       ('Софія Вільсон', TO_DATE('1994-04-14', 'YYYY-MM-DD'), 'Middle', 88000),
       ('Райан Кларк', TO_DATE('1984-08-17', 'YYYY-MM-DD'), 'Senior', 98000);


INSERT INTO client (NAME)
VALUES ('Apple'),
       ('Google'),
       ('Microsoft'),
       ('OnlyFans'),
       ('Amazon');


INSERT INTO project (CLIENT_ID, PROJECT_NAME, START_DATE, FINISH_DATE)
VALUES
    -- Проєкти для Apple
    (1, 'Project A', TO_DATE('2010-02-01', 'YYYY-MM-DD'), TO_DATE('2012-01-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (1, 'Project A', TO_DATE('2022-02-01', 'YYYY-MM-DD'), TO_DATE('2022-03-12 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (1, 'Project A', TO_DATE('2023-02-01', 'YYYY-MM-DD'), TO_DATE('2025-07-20 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (1, 'Project A', TO_DATE('2025-08-01', 'YYYY-MM-DD'), TO_DATE('2027-04-24 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (1, 'Project A', TO_DATE('2027-05-01', 'YYYY-MM-DD'), TO_DATE('2029-08-13 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (1, 'Project A', TO_DATE('2029-09-01', 'YYYY-MM-DD'), TO_DATE('2031-08-01 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (1, 'Project A', TO_DATE('2031-09-01', 'YYYY-MM-DD'), TO_DATE('2041-08-06 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    -- Проєкти для Google
    (2, 'Project B', TO_DATE('2022-01-01', 'YYYY-MM-DD'), TO_DATE('2025-01-16 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (2, 'Project B', TO_DATE('2022-02-01', 'YYYY-MM-DD'), TO_DATE('2023-01-18 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (2, 'Project B', TO_DATE('2010-02-01', 'YYYY-MM-DD'), TO_DATE('2012-01-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (2, 'Project B', TO_DATE('2010-02-01', 'YYYY-MM-DD'), TO_DATE('2012-03-20 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (2, 'Project B', TO_DATE('2026-02-01', 'YYYY-MM-DD'), TO_DATE('2026-07-03 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (2, 'Project B', TO_DATE('2010-02-01', 'YYYY-MM-DD'), TO_DATE('2012-01:10 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (2, 'Project B', TO_DATE('2031-09-01', 'YYYY-MM-DD'), TO_DATE('2033-08-01 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    -- Проєкти для Microsoft
    (3, 'Project C', TO_DATE('2022-01-01', 'YYYY-MM-DD'), TO_DATE('2027-01:20 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (3, 'Project C', TO_DATE('2021-02-01', 'YYYY-MM-DD'), TO_DATE('2023-01:31 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (3, 'Project C', TO_DATE('2018-02-01', 'YYYY-MM-DD'), TO_DATE('2023-07-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (3, 'Project C', TO_DATE('2012-08-01', 'YYYY-MM-DD'), TO_DATE('2024-01:31 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (3, 'Project C', TO_DATE('2016-02-01', 'YYYY-MM-DD'), TO_DATE('2025-07-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (3, 'Project C', TO_DATE('2017-08-01', 'YYYY-MM-DD'), TO_DATE('2025-08-28 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (3, 'Project C', TO_DATE('2022-09-01', 'YYYY-MM-DD'), TO_DATE('2024-08-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    -- Проєкти для OnlyFans
    (4, 'Project D', TO_DATE('2008-01-01', 'YYYY-MM-DD'), TO_DATE('2022-03-30 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (4, 'Project D', TO_DATE('2022-02-01', 'YYYY-MM-DD'), TO_DATE('2024-02-10 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (4, 'Project D', TO_DATE('2023-02-01', 'YYYY-MM-DD'), TO_DATE('2027-01-14 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (4, 'Project D', TO_DATE('2021-02-01', 'YYYY-MM-DD'), TO_DATE('2030-07-07 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (4, 'Project D', TO_DATE('2019-08-01', 'YYYY-MM-DD'), TO_DATE('2030-12-22 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (4, 'Project D', TO_DATE('2018-01-01', 'YYYY-MM-DD'), TO_DATE('2039-08-25 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    -- Проєкти для Amazon
    (5, 'Project E', TO_DATE('2009-01-01', 'YYYY-MM-DD'), TO_DATE('2021-09-12 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (5, 'Project E', TO_DATE('2010-02-01', 'YYYY-MM-DD'), TO_DATE('2012-01-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (5, 'Project E', TO_DATE('2011-02-01', 'YYYY-MM-DD'), TO_DATE('2023-04-30 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (5, 'Project E', TO_DATE('2012-08-01', 'YYYY-MM-DD'), TO_DATE('2022-07-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS')),
    (5, 'Project E', TO_DATE('2020-02-01', 'YYYY-MM-DD'), TO_DATE('2025-05-30 23:59:59', 'YYYY-MM-DD HH24:MI:SS'));



INSERT INTO project_worker
(PROJECT_ID, WORKER_ID)
VALUES (1, 1),
       (1, 3),
       (1, 5),
       (2, 4),
       (2, 6),
       (2, 8),
       (3, 2),
       (3, 7),
       (3, 9),
       (4, 10),
       (4, 1),
       (4, 5),
       (5, 9),
       (5, 3),
       (5, 6);

