drop database if exists projeto03web;

create database if not exists projeto03web;

use projeto03web;

create table produto (

idproduto int auto_increment primary key,
produto varchar (35) not null,
quantidade Integer not null,
preco Double not null
);

show tables;

desc produto;

insert into produto values (1,'arroz',10,4);
insert into produto values (2,'feijao',5,3.5);
insert into produto values (3,'fuba',10,30);