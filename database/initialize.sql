create database TODOapp;
use TODOapp;
create table Todo (description varchar(256), id int NOT NULL UNIQUE AUTO_INCREMENT);
create user 'todouser'@'%' identified by 'pieski123';
grant select, insert, delete on Todo to 'todouser'@'%';