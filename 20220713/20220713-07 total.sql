-- 집계 함수

SELECT * FROM employees;

SELECT count(*) from employees; -- count(*) 집계함수. *가 null값의 영향을 안받음.

-- 전화번호가 515 로 시작하는 직원을 조회하는 쿼리문
SELECT * from employees where PHONE_NUMBER like '515%';
-- 전화번호가 515로 시작하는 직원의 수를 조회하는 쿼리문
SELECT count(*) from employees where PHONE_NUMBER like '515%';

-- 연봉의 총합
SELECT * FROM employees;
SELECT SUM(SALARY) FROM employees; -- ()구하고 싶은 행 넣기

-- 평균
select avg(SALARY) FROM employees;

-- 최대
SELECT MAX(salARY) from employees;

-- 최소
SELECT MIN(salary) FROM employees;

-- 최대와 최소의 연봉의 차

select max(salary) - min(salary) from employees;

