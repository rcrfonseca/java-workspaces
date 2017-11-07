drop database if exists aula;
#se a tabela já existir ele apaga e grava por cima.

create database aula;
use aula;

create table pessoa(
idpessoa		integer			auto_increment,
nome			varchar(35)		not null,
email			varchar(35)		not null unique,
primary key(idpessoa));

#auto_increment é para não precisar dizer o id. O próprio banco gera o id
#not null é para fazê-los ser obrigatórios.

desc pessoa;