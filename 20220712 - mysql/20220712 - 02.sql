SELECT * FROM country; -- * 전부다본다.

SELECT * from city;

SELECT Name, Population from country;

DESC country; -- 테이블의 구조보기 desc

-- country 테이블에서 code열과 gnp열을 조회해보세여

select code, Gnp from country;

select * From country where Name = 'South Korea';   -- where 특정한 값만가지는 행만볼려고할떄 !보여줘라 프롬 나라에서 특정한이름'south korea'!

select * from country where name = 'japan';

select * from country where name = 'china';

select * from country where Continent = 'asia';



select * from country where name = "south korea" or name = "japan" or name = "china"; -- || 말고 or 로 써도됨.
-- population 인구 4천만명 이상 국가조회alter
select * From country where Population >= 40000000;

select * from country where Population >= 40000000 and Population <=50000000;

--  COntinent 'asia'를 제외한 국가목록 조회

select * from country where Continent <> 'asia'; -- <>부정