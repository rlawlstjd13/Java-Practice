SELECT * FROM world.country;
USE World;
USE hr;
SELECT * FROM country;



select * from employees;

-- 직원 이름(이름 + 성) 결합시킨 FULL NAME, -- 전화번호가 011로 시작하는 경우 '개인전화', 그외의 경우 '내선 번호)로 조회
SELECT concat(first_name,last_NAME) as 'fUll Name',
         case when phone_Number like'011%' then '개인 전화'
         ELSE '내선 번호'
         End as '분류'
		 from employees;
                    

-- null 값을 0.0로만들기
SELECT NAME, 
     case when lifeexpectancy is null then 0.0 
	      else lifeexpectancy
     end as life 
from country;

-- 로직? 만드는 방법   참이면 then 절 거짓이면 else절	마무리짓는 end 꼭 써줘야함
SELECT CASE WHEN 10 > 5 then '왼쪽이 오른쪽 보다 큽니다'
                   ELSE '왼쪽이 오른쪽 보다 작거나 같습니다'
			       ENd;
                   
SELECT case when 10 > 5 then '왼쪽'
            when 10 > 5 then ' 같음'
            when 10 > 5 then '오른쪽'
            end as '비교';
            
            
select ifnull(null, '대체 값');

-- 값이 3개, 1번쨰 길이 NUll이면 2번쨰값, 2번쨰 값도 널이면 3번쨰 값
select ifnull(ifnull("첫번째 값", "두번쨰값"), "세번쨰값");

select coalesce("첫", "두", "세");

SELEct NullIF('A', 'B'); -- 같으면 널 틀리면 첫번쨰꺼

