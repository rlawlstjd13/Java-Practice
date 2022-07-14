SELECT * FROM my_db.pktest;
-- primary키 2개도 설정가능한데 두개의값이 똑같으면 안됨!!!!! 인덱스값은 1개뿐

insert into pktest (mycol1, mycol2) values ('1', '1');

insert into pktest (mycol1, mycol2) values ('1', '2');

insert into pktest (mycol1, mycol2) values ('2', '1');

insert into pktest (mycol1, mycol2) values ('1', '1'); -- x