-- 부서 아이디가 90인 직원들 인원 수
SELECT count(*) from employees
      where DEPARTMENT_ID = 90;
-- 60
SELECT count(*) from employees
      where DEPARTMENT_ID = 60;
-- 30
SELECT count(*) from employees
      where DEPARTMENT_ID = 30;
      
-- 부서별로 직원들의 인원 수 (그룹짓기)  select 뒤랑 group by뒤랑 아다리 맞춰 group by: 집계함수
select DEPARTMENT_ID, count(*) from employees
	group by DEPARTMENT_ID;
    
-- 부서별 최고연봉, 최저연봉, 평균연봉, 연봉 합
SELECT DEPARTMENT_ID, max(salary), min(salary), avg(salary), sum(salary) 
from employees 
group by DEPARTMENT_ID;

-- groub by , distinct
select job_ID, LAST_NAME from employees group by JOB_ID; -- 107개의 중복되는게 제거됨.
select distinct JOB_ID, LAST_NAME from employees; -- distinct 중복제거 distinct 는 행이 완벽하게 똑같아야 중복제거됨.

-- 직원 테이블 last_name을 중복 제거하고 조회
select distinct last_name from employees;
-- 직원 테이블 last_name을 그룹 별로 인원수 조회
SElect last_name, count(*) from employees group by LAST_NAME;

-- last_name 그릅의 카운트들가 2이상인 행들만 조회
SElect last_name, count(*) 
from employees 
group by LAST_NAME
Having count(*) > 1; -- group에 조건을 줄떈 where이아닌 having

-- 위의 성을 가지는 직원 목록 조회

SELECT * from employess where last_name In (
SElect last_name from employees group by LAST_NAME Having count(*) > 1);

-- 5번쨰로 적게 받는 직원들 목록
SELECT * FROM employees where SALARY =
(SELECT distinct salary from employees order by salary limit 1 offset 4);

-- 상위 연봉 50명(같은 연봉에 대해서 First_NAme이 빠른친구)에 대해서 부서별로 몇명씩 있는지
SELECT DEPARTMENT_ID, count(*) from
(SELECT * From employees order by SALARY desc, FIRST_NAME asc limit 50) as A
group by DEPARTMENT_ID;
