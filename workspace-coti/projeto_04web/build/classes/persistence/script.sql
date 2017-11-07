drop database if exists projeto04web;
#
create database if not exists projeto04web;
#
use projeto04web;
#
create table login( 
idlogin int primary key auto_increment,
login varchar(35) unique not null,
senha varchar(20) not null);
#					
insert into login values (null, 'raphael', '123');
insert into login values (null, 'carlos', '456');
insert into login values (null, 'rocha', '789');
insert into login values (null, 'fonseca', '102');
#
select * from login;