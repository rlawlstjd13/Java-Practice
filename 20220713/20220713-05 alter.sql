-- 식당정보 테이블
-- 상호명
-- 전화번호
-- 주소 등등
CREATE TABLE Restaurant (
    RestaurantID Int primary key auto_increment,
	name varchar(20) Not Null,
    number varchar(20) Not Null,
    address varchar(20) Not Null
);
desc Restaurant;

INSERT INTO Restaurant (name, number, address) values ("짬뽕관", "000-000-0000", "학원 앞"),
													  ("도연정", "111-111-1111", "시장 안"),
													  ("교통부돼지국밥", "051-010-1010", "시장 입구");
                                                      
SELECT * FRom Restaurant;

-- 메뉴정보 테이블
-- 음식명
-- 가격
CREATE TABLE menu(
        menuId Int primary key auto_increment,
		menuName varchar(10),
        price int not null);
drop table menu;
desc menu;
INSERT INTO menu (menuName, price) values ("짬뽕", 7000), ("짜장면", 8000), ("탕수육", 20000),
                                          ("돼지국밥", 8000), ("밀면 제육세트", 8000), ("돌솥비빔밥", 5000);
                                          
SELECT * FROM menu;
-- ALTER 변경명령어 식당과 메뉴 혼합.
ALTER TABLE menu ADD column RestaurantID int;

-- 업데이트 한다. 그럼 모든행의 RestaurantID이 1로바뀜.
UPDATE menu
SET RestaurantID = 2
Where menuID <> 1; -- 1번뺴고 2로만든다?

-- set 로만든 추가키가 레스토랑 테이블에 레스토랑 아이디(키값)을
ALTER TABLE menu ADD constraint foreign key(RestaurantID) references Restaurant (Restaurantid);

Desc menu;
SELECT * FROM menu;


                                          
