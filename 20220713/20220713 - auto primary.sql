-- primary key auto_increment 자료가 들어오면 정수번호 하나씩을 자동으로 부여
create table book (
     bookid Int primary key auto_increment,
     title varchar(30),
     price int
);

DESC book;

INSERT INTO book(title, price) values
 ("책1", 2000), ("책2", 3000), ("중복이름", 2500), ("중복이름", 3000);
 
 SELECT * FROM book;
 
 
 delete from book where bookid = 3;
 
 INsert into book (title, price) values ("새로운 이름", 3500);
 