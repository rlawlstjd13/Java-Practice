select * from employees;

SELECT rtrim('a          '); -- 오른쪽 공백제거
SELECT ltrim('         a      '); -- 왼쪽 공백제거
SELECT trim('        a        '); -- 둘다

SELECT lower('ABCDE'); -- 소문자로만들기
SELECT upper('abcde'); -- 대문자로 만들기

select reverse('qwer'); -- 거꾸로

select concat('문자열', '결합', '함수');
select concat("결합", null, "값이 없으면?"); -- 하나라도 null이면 null반환

select char_length('문자열길이');

select replace('원본 문자열에서 변환합니다', '변환', 'replace'); -- 왼쪽 변환하고싶은값 중간은 변환 오른쪽은 변환된 값
Select replace('1234', '1', '5');

select substring('employees', 5); -- 문자열, 자를 시작 위치
SELECT substring('employees', 5, 2); -- 문자열, 자를 시작 위치, 개수
SELECT substring('employees', -3); -- 음수일떄 우측에서부터 위치를 세어나감
select substring('employees', -3, 2);

SELECT lpad("123", 5, "0"); -- 숫자값 , 원하는 자리수, 0 이걸로 남는자리 채움. lpad 왼쪽에서
SELECT lpad("456", 5, "*"); -- 숫자값 , 원하는 자리수, * 이걸로 남는자리 채움. rpad 왼쪽에서
SELECT repeat("반복 결합", 3);

SELECT locate('D', 'ABCDEFG'); -- d의 위치찾기
SELECT locate('위치', '문자열의 위치를 찾는데 sql의 문자 순서는 1부터임');
SELECT locate('A', 'ABABA', 2);

-- '515.123.4567'
-- .을 기준으로 각각잘라보셈
SELECT substring('515.123.4567', 1, 3);
select substring('515.123.4567', 5, 3);
select substring('515.123.4567', -4, 4);

-- 직원 테이블 전화번호 앞자리 3자리를 분류해서 개수

SELECT substring(phone_Number, 1, 3), count(*) from employees
group by substring(phone_number, 1, 3);

-- 
SELECT rand(); -- 0 ~ 1 사이
SELECT ROUND(123.123, 2); -- 자리수만큼 반올림
SELECT FLOOR(1.555); -- 내림
SELECT CEIL(1.222); -- 올림

SELECT ABS(-55); -- 절대값
SELECT POW(2, 8); -- 제곱

-- 주사위 1 ~ 6 사이의 난수(정수) 생성

SELECT ceil(rand() * 6);
