drop database if exists webexercicio04;

create database if not exists webexercicio04;
use webexercicio04;

create table login( 
idlogin int primary key auto_increment,
login varchar(35) not null,
senha varchar(35) not null);