-- primary key : 기능 :not null,           index(정렬이됨) 조회하기위해 정렬이됨.
select * from my_db.test
where mystr = 'a'; -- 프라이머리키로 찾아서 성능이빠름

SELECT * from test
where myint = 2; -- 성능이 느림.