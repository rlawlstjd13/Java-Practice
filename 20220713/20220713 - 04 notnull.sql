-- Not Null 널값 허용안함. -- unique 고유하다
CREATE TABLE persons(
     personid Int primary key auto_increment,
     firstName varchar(10) Not Null,
     lastName varchar(10) Not Null,
     age int Not Null,
     email varchar(30) Not Null unique
);

drop table persons;

Insert into persons (firstName, lastName, age, email) values ("길동", "홍", 20,"길동@길동.net");
Insert into persons (firstName, lastName, age, email) values ("길동", "고", 42,"kildong@길동.net");

select * from persons;

-- 테이블 이름
-- 각 열 (이름, 타입, 제약)
-- key 열