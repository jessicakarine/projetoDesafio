

create table apartamento (
 id bigint not null auto_increment,
 andar int not null,
 numeroApt int not null,
 primary key(id)
) engine=InnoDB;

insert into apartamento (id, andar, numeroApt) values (1, 1, 101);
insert into apartamento (id, andar, numeroApt) values (2, 1, 102);
insert into apartamento (id, andar, numeroApt) values (3, 2, 201);
insert into apartamento (id, andar, numeroApt) values (4, 2, 202);
