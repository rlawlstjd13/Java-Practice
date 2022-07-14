select * from employees;

desc employees;

-- mysql 날짜 : date
-- 시간 : time
-- 날짜시간 : DATETIME / TIMESTAMP

SELECT current_date();
SELECT current_time();
SELECT current_timestamp();

SELECT DATE '2022-07-14';
SELECT TIME '12:05:33';

-- hire_date가 1987년 6월
SELECT * FROM employees
WHERE HIRE_DATE between '1987-06-01' AND '1987-06-30';

SELECT DATE '1987-06-01' + 40; -- mysql은 합연산 지원안됨 ㅠ
SELECT adddate('1987-06-01', 40); -- 날짜추가 함수
SELECT subdate('1987-06-01', 1); -- 날짜 뺴기 함수
SELECT date_add('1987-06-01', INTERVAL 40 DAY); -- 40일간~
SELECT DATE_SUB('1987-06-01', interval 1 month);

SELECT '1987-06-01' + interval 1 year; -- 간격 표현은 합연산 가능
SELECT '1987-06-01' + interval 1 day;

select dayofweek('2022-07-14'); -- 1 일요일 2월요일 3화 4수 5목 6금 7 토

SELECT extract(year from '2022-07-14'); -- 년
SELECT extract(month from '2022-07-14'); -- 월
SELECT extract(DAy from '2022-07-14'); -- 일 단위 표혀ㅑㄴ

SELECT DATEDIFF('2022-06-01', '2022-06-13'); -- 값 뺴기?


-- 다른 프로그램에서 문자열을 날짜로바꾸고 날짜를 문자로바꾸는 함수? mysql은 필요업음
-- SELECT STR_TO_DATE('2022-06-13', '%y/%m/%d');
-- SELECT DATE_FORMAT



-- 17일에 고용된 직원 목록
SELECT * FROM employees
where HIRE_DATE like '%17';
SELECT * FROM employees where extract(day from hire_Date) = 17;

-- job history 각 행별로 일한'기간'(일)조회
select * from job_history;
-- 스타트날짜 끝날짜 datediff뺴기 함수 as 별명 inter for 잡히스토리 테이블에서
SElect START_DATE, END_DATE, DATEDIFF(END_DATE, Start_DATE) as inter from job_history;



-- 자료형 숫자, 문자열, 날짜
SELECT CAST(10 AS time); -- cast 타입변환 함수 as time 시간으로 변환
SELECT CAST('10' AS double) + 5.5;

SELECT CONVERT(10, time); -- 위랑 똑같은데 as가 아닌 ,
select convert(10, double) + 5.5;