CREATE SCHEMA IF NOT EXISTS ejd;
USE ejd;

CREATE TABLE movie
(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    genre VARCHAR(255),
    YearOfPublish INT
);
