drop database if exists aula;
#se a tabela j� existir ele apaga e grava por cima.

create database aula;
use aula;

create table pessoa(
idpessoa		integer			auto_increment,
nome			varchar(35)		not null,
email			varchar(35)		not null unique,
primary key(idpessoa));

#auto_increment � para n�o precisar dizer o id. O pr�prio banco gera o id
#not null � para faz�-los ser obrigat�rios.

desc pessoa;