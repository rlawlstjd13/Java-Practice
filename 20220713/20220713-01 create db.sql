CREATE DATABASE my_db; -- 데이터베이스 생성 create

SHOW DATABASES;

USE my_db;

SHOW tables;
-- 사람테이블
-- '열'(colum) 1. 이름 문자열
-- '열'(colum 2. 나이 정수
CREATE TABLE persons ( -- VARCHAR 문자열을 나타내는 타입 ()안은 길이
    name VARCHAR(10),
    age INT
); 

DESC persons; -- 속성보기

SELECT * FROM persons;

INSERT INTO persons (name, age) VALUES ("홍길동", 22); -- 추가 하는방법.
-- '브루스 리' , 30 행추가
-- '스티븐 킹', 40
insert into persons (name, age) values ("브루스 리", 30);
insert into persons (name, age) values ("스티븐 킹", 40);
-- 철수, 20
-- 철수, 30
-- 철수, 40
INSERT INTO persons (name, age) values ('철수', 20), ('철수', 30), ('철수', 40); -- 한번에 여러개 추가

DELETE from persons; -- 전부다 지우기

DROP TABLE persons; -- 테이블 지우기

-- 책 테이블 
-- 제목 : 문자열
-- 가격 : 정수
show Tables;
desc bookinfo;
CREATE TABLE bookInfo (
    name VARCHAR(20),
    price int
);

SELECT * FROM bookINfo;

INSERT INTO bookInfo (name, price) values ("파워자바", 25000);
INSERT INTO bookINfo (name, price) values ("꽃을 보듯 너를 본다", 12000);



-- 문자열 타입

-- CHAR(5) -- 고정된 문자열길이 다섯글자로하면 한자리여도 나머지는 공백으로 됨. 'A    '
-- VARCHAR(5) -- 가변 길이 'A'

CREATE TABLE testChar(
   fixlength char(5),
   varlength varchar(5)
);

INSERT INTO testchar (fixlength, varlength) values('A', 'A');

SELECT char_length(fixlength), char_length(varlength) from testChar;

select * from testChar;

SELECT rtrim('A            '); -- 오른쪽 빈공간 삭제 메소드
SELECT ltrim('            A'); -- 왼쪽 빈공간 삭제 메소드.	