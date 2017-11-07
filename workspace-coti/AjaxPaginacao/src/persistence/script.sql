drop database ajax;
create database ajax;
use ajax;

create table pessoa ( 
idpessoa Integer primary key auto_increment,
nome varchar(35) not null,
sexo enum('M','F') not null
);

use ajax;

insert into pessoa values(null, 'kelly', 'f');
insert into pessoa values(null, 'katia leine', 'f');
insert into pessoa values(null, 'cristiane', 'f');
insert into pessoa values(null, 'carlos', 'm');
insert into pessoa values(null, 'carlos alberto', 'm');
insert into pessoa values(null, 'carlos fernando', 'm');
insert into pessoa values(null, 'marcelo', 'm');
insert into pessoa values(null, 'marcio', 'm');
insert into pessoa values(null, 'marcia', 'f');
insert into pessoa values(null, 'marcia cristina', 'f');

select * from pessoa where nome like '%a%';