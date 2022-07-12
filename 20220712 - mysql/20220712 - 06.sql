SELECT * FROM country limit 5; -- limit: 제한두기 5개만보기

-- 인구가 가장 많은 1개의 국가 조회
select * from country order by population DEsc limit 1;

-- 면적순 탑 5
SELECT * fROM country order by SurfaceArea DESC LIMIT 5;

-- CONTINENT 'ASIA'인 국가들중 면적이 좁은순으로 10개 국가;
select * from country WHERE Continent = 'asia' order by SurfaceArea asc limit 10;

-- Regiondl ~africa로 끝나는 국가들 중 독립년도 (indepYear)가 가장 최근인 10개 국가alter
select * from country where Region like '%africa' order by IndepYear desc limit 10;
-- 면적당 인구비율(surfaceArea / population) top 10;
select * from country order by Population / SurfaceArea desc limit 10;

-- (Gnpold : Gnp 변화량) 최상위 탑텐
select * from country order by GNP - GNPOld desc limit 10;