create database ProyectoMigracion;
use ProyectoMigracion;

create table banco(
noBoleta int(10) primary key not null,
noComprobante int(10) not null,
estado varchar(1)not null
)ENGINE=INNODB default CHARSET=LATIN1;

create table datospersonales(
noIdentificacion int(14) primary key not null,
nomCorreo varchar(20) not null,
numTelefono int(8)not null,
numCelular int(8)not null,
nomOcupacion varchar(50)not null,
nomPais varchar(9)not null,
nomDepartamento varchar(14)not null,
nomMunicipio varchar(60)not null,
nomDireccion varchar(60)not null,
numAltura int(3) not null,
nomTez varchar(10) not null,
nomOjos varchar(10) not null
)ENGINE=INNODB default CHARSET=LATIN1;

create table datospasaporte(
noPasaporte int(20) auto_increment primary key not null,
noIdentificacion int(14) not null,
tipoTramite varchar(15) not null,
tipoPasaporte varchar(11) not null,
tipoCaso varchar(15) not null,
foreign key (noIdentificacion) references datospersonales(noIdentificacion) 
)ENGINE=INNODB default CHARSET=LATIN1;
