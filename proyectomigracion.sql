create database ProyectoMigracion;
use ProyectoMigracion;

create table banco(
noBoleta int(10) primary key not null,
noComprobante int(10) not null,
estado varchar(1)not null
)ENGINE=INNODB default CHARSET=LATIN1;