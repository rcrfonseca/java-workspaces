create database if not exists webexercicio01;

use webexercicio01;

create table aluno (
idaluno integer auto_increment primary key,
nota1 double not null,
nota2 double not null
);

show tables;

desc aluno;