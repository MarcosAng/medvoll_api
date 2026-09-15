create table usuarios(
 id bigint not null AUTO_INCREMENT,
 login varchar(100) not null,
 senha varchar(255) not null,

 PRIMARY KEY(id)
);