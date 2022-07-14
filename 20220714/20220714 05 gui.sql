USE my_db;
DEsc book;
-- gui 로 다되지만 insert,select,update,delete = crud   == dml 데이터 조작언어
-- 스패너 모양으로도 변경가능합니다 디폴트값도 설정 가능
-- alter 테이블 변경 체인지 콜럽 타이틀을 타이틀 원래설정에서 null값만 못들어오게 ㅇㅈ?
ALTER TABLE book change column title title varchar(30) not null;

INSERT into book (title) values ('디폴터 확인');
Select * from book;


-- CREATE TABLE mypractice (
   --    colname1 varchar(50) DEFAULT '39838o'
-- );