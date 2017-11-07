use projeto09web;

create table pessoa(
idpessoa integer primary key auto_increment,
nome varchar(35),
sexo varchar(1)
);

insert into pessoa values(null, 'raphael', 'm');
insert into pessoa values(null, 'carlos', 'm');
insert into pessoa values(null, 'maria', 'f');
insert into pessoa values(null, 'luiza', 'f');
insert into pessoa values(null, 'rita', 'f');
insert into pessoa values(null, 'roberto', 'm');
insert into pessoa values(null, 'andre', 'm');
insert into pessoa values(null, 'gileno', 'm');