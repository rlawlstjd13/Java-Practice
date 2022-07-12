select * from country where name not in("South korea", "japan", "china"); -- in 여러가지 ()안에alter not 은 부정표현 뒤에세개뺴고 나옴,

select * from country where Population not between 40000000 And 50000000; -- between 사이에

-- Continent 컬럼 값이 north america, Europe, Asia 를 제외한 국가들 중
-- GNp값이 100 이상 1000이하인 국가목록 조회

select * from country where Continent not in('north america', 'Europe', 'Asia') and Gnp between 100 and 1000;



Select * FRom country;

SELECT * From country Where IndepYear is not Null; -- null은 연산하면 null로 다먹음 개채무결성  is라는 명령어로 극복하고 표현?ㅋㅋ null로 표헌