-- 각 직원들의 이름과 연봉, 평균연봉과의 차(평균연봉 - 연봉)를 조회해보세요.
SELECT * from employees where EMPLOYEE_ID;
SELECT avg(salary) from employees;
SELECT FIRST_NAME, LAST_NAME, SALARY - (Select avg(salary) from employees) As "평균연봉의 차" from employees;

-- 최고 연봉직원과 최저 연봉직원들의 이름을 조회해보세요.
SELECT FIRST_NAME, LAST_NAME from employees where SALARY = (select max(salary) from employees);
SELECT FIRST_NAME, LAST_NAME from employees where SALARY = (select min(salary) from employees);


-- 부서명이 IT로 시작하는 직원들의 수(카운트)를 조회해보세요. 완료
SELECT * FROM employees;
SELECT * FRom departments where DEPARTMENT_NAME like 'it%';
SELECT count(*) FRom departments where DEPARTMENT_NAME like 'it%';
-- douglas grant의 이메이을 'dog@naver.com으로 변경
SELECT * from employees where FIRST_NAME like 'douglas';
update employees set email = 'dog@naver.com' where employee_ID = 199; -- 업데이트 할 테이블 set 이메일 = 뭐로 where 어디있는거
SELECT * FROM employees;

-- ellen abel과 같은 부서에서 근무하는 직원을 연봉 내림차순으로 정렬해서 조회;
SELECT department_ID from employees where FIRST_NAME like 'ellen';
select * from employees where DEPARTMENT_ID in (
SELECT department_ID from employees where FIRST_NAME like 'ellen')order by SALARY desc;


-- 부서명이 IT로 시작하는 부서에서 근무하는 최고연봉자보다 높은 연봉을 받는 지원 목록을 연봉 오름차순으로 조회
--  근무하는 최고연봉자보다 높은 연봉을 받는

SELECT * from employees where DEPARTMENT_ID In 
(select DEPARTMENT_ID from departments where DEPARTMENT_NAME = "IT%")  order by salary;




-- 자기가 속한 부서의 평균보다 많이받는 직원

