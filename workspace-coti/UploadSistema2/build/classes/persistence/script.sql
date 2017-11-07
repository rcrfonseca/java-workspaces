drop database if exists foto;

create database foto;
use foto;

create table pessoa( 
idpessoa int primary key,
nome varchar(35) not null,
sexo varchar(1) not null,
foto varchar(35)
);

insert into pessoa values(1,'Raphael', 'M', 'raphael01.jpg');

select * from pessoa;