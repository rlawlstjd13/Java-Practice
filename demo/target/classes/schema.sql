create schema greenboard;
set schema greenboard;

CREATE TABLE board (
	no int primary key auto_increment,
	title varchar(50) not null,
	writer varchar(50) not null
);

Insert Into board(title, writer) values('디비 가짜제목', '디비 가짜 지은이');