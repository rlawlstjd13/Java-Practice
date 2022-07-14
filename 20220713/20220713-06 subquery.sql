-- hr 부서 테이블 모든행과열 조회
SELECT * FROM departments;
-- 부서명이 it 로 시작하는 부서들 조회
SELECT * FROM departments where DEPARTMENT_NAME like 'it%';
-- 직원 테이블에서 60 20 30 
SELECT * FROM employees where DEPARTMENT_ID in (
         SELECT DEPARTMENT_ID from departments where DEPARTMENT_NAME like 'it%'-- 셀렉트에서 괄호치고 또 셀렉트는 서브쿼리!
);

-- 연봉 내림차순 정렬.
-- 연봉 상위 10명.
-- 연봉을 오름차순으로 조회
-- 1. 연봉최고 10명 먼저뽑고 서브쿼리활용해서 2. 내림차순으로 변경  AS ~별명을 붙여야함. 무조건
SELECT * FROM (
SELECT * FROM employees order by SALARY Desc limit 10
) AS A order by SALARY asc;

SELECT (SELECT 1 + 1), 2, 3, 4;

-- david austin의  연봉과 같은 연봉을 받는 직원을 조회

SELECT * from employees where FIRST_NAME = 'david' and LAST_name = 'austin';
-- salary 꼭붙여야함.
SELECT * FRom employees where SALARY = (
SELECT SALARY from employees where FIRST_NAME = 'david' and LAST_name = 'austin'
);
