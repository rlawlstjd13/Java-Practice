-- hr 데이터베이스 사용하기 명령어 작성
Use hr;
-- employees(직원) 테이블의 구조를 조회 해보세요.
Desc employees; -- desc 테이블구조
-- employees(직원) 테이블의 모든 행의 모든 열을 조회해보세요.
SELECT * FROM employees;
-- 직원 테이블의 first_NAme(이름) 열의값이 'john'인 직원 조회
select * from employees where first_name = "john";
-- 직원 테이블의 Last_name(이름) 열의 값이 'john'을 포함하는 값' 직원 조회
select * from employees where last_name like '%john%';
-- 직원 테이블의 이름의 값이 6글자인 직원 조회;
select * from employees where first_name like '______';
-- 직원테이블의 Salary 열의 값이 10000 ~ 15000 직원조회
select * from employees where salary between 10000 and 15000;
-- 직원테이블의 이름, 성, 연봉, 컬럽과 연봉의 6%를 연산하여 tax 라는 별명으로 조회하세요.
select first_name, last_name, salary, Round(salary * 0.06) As 'tax' from employees;
