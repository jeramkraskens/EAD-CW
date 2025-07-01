
create database Library;

use Library;

create table newbook(
	id varchar(10),
    bname varchar(6),
    cname varchar(50),
    pub varchar(50),
    author varchar(50),
    pages varchar(20)
    );

CREATE TABLE member2 (
    id VARCHAR(10) NOT NULL PRIMARY KEY,
    name VARCHAR(30),
    phone VARCHAR(20)
);

create table IssueBook(
	id varchar(10),
    BookName varchar(50),
    BDate date,
    Breturn date
    );
    
create table publisher(
	id varchar(10),
    Name varchar(40),
    Address varchar(50),
    PhoneNo varchar(12)
    );

create table returnBook(
	id varchar(10),
    BookName varchar(50),
    BDate date,
    Breturn date
    );

select * from returnBook;

show tables from Library;

drop table returnBook;



















