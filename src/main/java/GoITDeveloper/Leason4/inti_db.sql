-- створення таблиць

CREATE TABLE worker
(
    ID       INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    NAME     VARCHAR(1000) NOT NULL CHECK (LENGTH(NAME) BETWEEN 2 AND 1000),
    BIRTHDAY DATE CHECK (EXTRACT(YEAR FROM BIRTHDAY) > 1900),
    LEVEL    varchar(100)  NOT NULL,
    SALARY   INTEGER CHECK (SALARY >= 100 AND SALARY <= 100000)
);

CREATE TABLE client
(
    ID   INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    NAME VARCHAR(1000) NOT NULL CHECK (LENGTH(NAME) BETWEEN 2 AND 1000)
);

CREATE TABLE project
(
    ID          INT GENERATED BY DEFAULT AS IDENTITY,
    CLIENT_ID   INT,
    START_DATE  DATE,
    FINISH_DATE DATE,
    FOREIGN KEY (CLIENT_ID) REFERENCES client (ID)
);


CREATE TABLE project_worker
(
    PROJECT_ID  INT,
    WORKER_ID   INT,
    PRIMARY KEY (PROJECT_ID, WORKER_ID),
    FOREIGN KEY (PROJECT_ID) REFERENCES client (ID),
    FOREIGN KEY (WORKER_ID) REFERENCES worker (ID)
);


-- #####################################################################

-- Видалення таблиць та їх вмісту
DROP TABLE worker;
DROP TABLE client;
DROP TABLE project;
DROP TABLE project_worker;

