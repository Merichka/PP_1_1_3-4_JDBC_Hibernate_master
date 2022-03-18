CREATE SCHEMA IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS user;
CREATE TABLE users(id LONG PRIMARY KEY AUTO_INCREMENT, name STRING, lastName STRING, age BYTE);

INSERT INTO users(name, lastName, age) VALUES ('Alex', 'Alecseev', '30');