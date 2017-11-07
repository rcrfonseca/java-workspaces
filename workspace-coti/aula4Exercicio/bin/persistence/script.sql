create database if not exists intensivo;

use intensivo;

create table aluno (
idaluno 	int 				primary key,
nome 		varchar(20) 		not null,
sexo		enum('m','f')		not null,
);

insert into aluno values (1, 'raphael', 'm');
insert into aluno values (2, 'aline', 'f');
insert into aluno values (3, 'anderson', 'm');

show databases;

show tables;

desc aluno;

select * from aluno;
