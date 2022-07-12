SELECT * from country
where name Like '%korea%'; -- %% 포함된것 비스무리한거로 찾기?: 패턴검색.

SELECT * from country where name like '%k%';

SELECT * from country where name like '%k'; -- %k k로 끝나는것만 찾기
SELECT * from country where name like 'k%'; -- k로 시작하는
-- 국가이름 a로 시작하고 a 로끝나는 국가 찾기
SELECT * from country where name like 'A%A';
-- 국가이름 a로 시작하고 a 로끝나는 국가 찾기(6자);
SELECT * from country where name like 'A____A';
-- 국가이름 ria로끝나는 국가 찾기;
SELECT * From country where name like'%ria';

-- Region 칼럼이 north~~~시작하는 국가
select * From country where Region like 'north%';

-- Region 컬럼에 A로시작해서 a로 끝나는 명칭을 포함하지 않는 국가

SELECT * FROM country where Region not like '%A%A' and Region not like 'a%a%';
