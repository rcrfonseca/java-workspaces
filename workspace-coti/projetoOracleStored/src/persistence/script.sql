conn system/coti;

select * from v$version;
select name from v$database;
select user from dual;

--cascade constraint apaga se existir com relacionamento
drop table pessoa cascade constraint;

create table pessoa (idpessoa number(5) primary key,
nome varchar(35) not null,
sexo varchar(1) check(sexo in('M','F','m','f','I','i'))
);
--check só pode ser usado os tipos definidos por ele

insert into pessoa values(1, 'tinoco', 'm');
insert into pessoa values(2, 'belem', 'm');
insert into pessoa values(3, 'maria', 'f');
insert into pessoa values(4, 'bernadete', 'f');
insert into pessoa values(5, 'raphael', 'm');
commit;

--controle de transação automatico
--commit atualiza o banco
--storedprocedure é para criar rotinas para outros usarem

create or replace procedure gravaPessoa(vid number, vnome varchar2, vsexo varchar2)
is
begin
	insert into pessoa values (vid, vnome, vsexo);
	commit;	
end;
/

exec gravaPessoa(12,'luana','f');
