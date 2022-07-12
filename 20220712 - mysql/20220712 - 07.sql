SELECT * FROM country;
SELECT * from country limit 1 OFFSET 2; -- offset 건너뛰고~alter
SELECT * FROM country limit 2, 1; -- 위랑 같은뜻	

-- page 나누기
select * from country limit 10 offset 0;
select * from country limit 10 offset 10; -- 10개볼수있고 20개 건너뛰어서
select * from country limit 10 offset 20;

