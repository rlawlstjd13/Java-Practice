SELECT Code AS "코드", Name AS "이름", POPulation AS"인구" From country; -- 코드랑 네임 인구만       AS " ", 별명을만들어줌?
-- 위의 조회 + SurfaceArea(면적) 컬럼을 추가로 조회하는데

SELECT Code AS "코드", Name AS "이름", POPulation AS "인구", SUrfaceArea AS "면적" From country;

-- surfacearea 가 50,000이하이면서 population이 10,000,000 이상인 국가의 인구밀도를 조회하세요.

SELECT Code AS "코드", Name AS "이름", POPulation AS "인구", SUrfaceArea AS "면적", ROUnd(Population / SurfaceArea, 1) 
AS"인구밀도"From country 
where SurfaceArea <= 50000 And Population >= 10000000; -- Round 반올림해주는 함수 왼쪽이 값 우측이 반올림. 흐름으로 인해 별명으론 불가.

-- 인구 밀도 조회하는데
SELECT Code AS "코드", Name AS "이름", POPulation AS "인구", SUrfaceArea AS "면적", ROUnd(Population / SurfaceArea, 1) 
AS"인구밀도"From country 
order by 인구 desc; -- order by 정렬 기능이며       별명으로 가능. 이유는 셀릭이 일어난 이후라 ASC 오름차순 desc내림차순

-- 아시아 대륙 국가들의 인구순(내림차순)
SELECT * FROM country where Continent = "asia" order by Population desc;

-- LifeExpectancy(기대수명) 오름차순
select * FRom country where LifeExpectancy is not null order by LifeExpectancy asc; --  LifeExpectancy is not null 에서 널제외.
-- 국가의 이름과 인구와 gnp, gnpold 두개의 차이를 구해서 변화량 같이 조회
SELECT Name AS "이름", population AS "인구", GNP AS "변화량", GNPOLD AS "예전 변화량", GNPOld - GNP AS"GNP 변화량" 
From country
where gnp is Not null And Gnpold IS NOT NULL
order by `GNP 변화량`; -- " " 스페이바 쓰면안되용 별명하라떄 ` ` 는 가능


-- 대륙순으로 정렬해서 조회
SELECT * FROM country order by Continent, Population; -- , 다음 기준 적을수 있음.

-- GovermentForm 오름차순 기준, GNP 내림차순 정렬조회
SELECT * from country order by GovernmentForm, GNP desc;