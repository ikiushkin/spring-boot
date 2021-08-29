DROP DATABASE if EXISTS spring_boot;
CREATE DATABASE if not exists spring_boot;
use spring_boot;

DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users (
    ID INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    surname VARCHAR(100) NOT NULL,
    CREATED_DATE DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (ID)
);

INSERT INTO users (name, surname) VALUES ('JOHN', 'SMITH'),
                                         ('PETER', 'ANDERS'),
                                         ('SARAH', 'CONOR'),
                                         ('OLIVIA', 'BRUKs');