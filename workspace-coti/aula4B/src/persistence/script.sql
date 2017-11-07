drop database intensivo2;
create database intensivo2;
use intensivo2;
create table pessoa(idpessoa int primary key,
					nome varchar (35) not null);
#pessoa tem a chave primaria idpessoa, chave que nao pode ser duplicada
					
create table endereco(idendereco int primary key,
					  cidade varchar (35) not null,
					  bairro varchar (35),
					  id_pessoa int unique, 
					  foreign key(id_pessoa)references pessoa (idpessoa));

#o id_pessoa é o que faz o relacionamento de Pessoa com Endereco, ou seja, cada id_pessoa terá um endereco
#por isso que ele é unique
#id_pessoa
#relacionamento de 1 para 1
#relacionamento entre pessoa e endereco

insert into pessoa values (1,'Obama');
insert into pessoa values (2,'Madjin Boo');
insert into pessoa values (3,'Igor');

select * from pessoa;

insert into endereco values (10,'California','NI',2);
insert into endereco values (11,'Cabucu','RJ',1);
insert into endereco values (12,'Penha','RJ',3);
select * from endereco;

#Select join (junção)
#inner join => dados que existem nas 2 tabelas (interseção)
#existem outros join (left join, right join...)



select
	p.nome,
	e.bairro,
	e.cidade
from pessoa p
inner join endereco e
on p.idpessoa=e.id_pessoa;
#é obrigatório ter essa linha de cima para dizer aonde está a chave primária e aonde está a linha estrangeira

#VIEW => serve para gravar e nomear o select 
create view vw_pessoa as
select
	p.nome,
	e.bairro,
	e.cidade
from pessoa p
inner join endereco e
on p.idpessoa=e.id_pessoa;

select from vw_pessoa;

# um para um
#um para muitos
#muitos para muitos