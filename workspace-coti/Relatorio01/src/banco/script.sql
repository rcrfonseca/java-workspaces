create database banco1;
use banco1;
create table produto(
idproduto int primary key,
produto varchar(20),
preco double,
quantidade int);

insert into produto values(1,'maca',2.5,5);
insert into produto values(2,'banana',6,12);
insert into produto values(3,'mamao',8,7);
insert into produto values(4,'pera',1,9);
insert into produto values(5,'abacaxi',7,10);
insert into produto values(6,'uva',5.6,12);
insert into produto values(7,'limao',10,30);
insert into produto values(8,'melancia',8.9,40);

select * from produto;