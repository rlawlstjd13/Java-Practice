-- 학생
-- 이름 : 가변길이 문자열(10자)
-- 나이 : 정수
-- 학점 : 실수

CREATE TABLE students(
    name varchar(10),
    age Int,
    score double
    );
    
DEsc Students;

Insert into students (name, age, score) values('길동', 20, 3.3);
Insert into students (name, age, score) values('둘리', 20.5, 3.3); -- INT는 소수자리 표현 불가

select * from students;

Insert into students (name, age, score) values('길동', 21, 2.6);
DELETE FROM students where name = '둘리';
