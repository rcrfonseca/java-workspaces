drop database jsf; 
create database jsf; 
 use jsf;

 create table pessoa(idpessoa int primary key auto_increment,
                     nome varchar (35),
                     sexo varchar (1));


create table endereco(idendereco int primary key auto_increment,
                      bairro varchar (35),
                      cidade varchar (35),
                      estado varchar (2),
                      id_pessoa int,
      foreign key(id_pessoa) references pessoa(idpessoa));
 

insert into pessoa values (null,'luis','m');
insert into pessoa values (null,'anny','f');
insert into pessoa values (null,'hulk','m');

insert into endereco values (null,'posse','Nova iguacu','rj',1);
insert into endereco values (null,'anchieta','rio de janeiro','rj',2);
insert into endereco values (null,'pavuna','rio de janeiro','rj',3);

select * from pessoa;
select * from endereco;

create view visao1 as
  select p.nome, p.sexo, e.bairro, e.cidade, e.estado
  from pessoa p, endereco e 
  where p.idpessoa = e.id_pessoa;

--atalho de uma consulta, inner join implicito (carteziano)
select * from visao1;

   

