Drop database my_db; 

CREATE DATABASE my_db;
USE my_db;
CREATE TABLE students( -- pirmary key 주요키
    number int primary Key,
    name varchar(10),
    age Int,
    score double
);
drop table students;
desc students;

insert into students (number, name, age, score) values (1234, '길동', 20, 3.3);
insert into students (number, name, age, score) values (1235, '둘리', 30, 4.4);
insert into students (number, name, age, score) values (1236, '길동', 20, 3.3);
Select * from students;