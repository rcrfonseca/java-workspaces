create database if not exists webexercicio02;

use webexercicio02;

create table produto ( 
idproduto Integer auto_increment primary key,
nome varchar(15) not null,
preco Double not null,
quantidade Integer not null
);