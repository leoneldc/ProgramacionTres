create database ProyectoMigracion;
use ProyectoMigracion;

create table banco(
noBoleta int(10) not null,
noComprobante int(10) not null,
estado varchar(1)not null,
primary key (noBoleta, noComprobante)
)ENGINE=INNODB default CHARSET=LATIN1;

CREATE TABLE Renap (
  DPI int(13) primary key not null,
 NombreC varchar(50) not null,
 FechaDnacimiento varchar(30)not null,
 nacionalidad varchar(45) not null,
 EstadoCiil varchar(45) not null,
 sexo varchar(25) not null
) ENGINE=INNODB default CHARSET=LATIN1;

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
tipoTramite varchar(90) not null,
tipoPasaporte varchar(90) not null,
tipoCaso varchar(90) not null,
foreign key (noIdentificacion) references datospersonales(noIdentificacion) 
)ENGINE=INNODB default CHARSET=LATIN1;

CREATE TABLE citas (
  id_citas int(20) primary key auto_increment not null,
  boleta_citas int(10) not null,
  recibo_citas int(10) not null,
  nombre_citas varchar(50) not null,
  apellido_citas varchar(50) not null,
  dpi_citas int(50) not null,
  foreign key (dpi_citas) references Renap(DPI),
  foreign key (boleta_citas, recibo_citas) references banco(noBoleta, noComprobante)
) ENGINE=INNODB default CHARSET=LATIN1;

CREATE TABLE agendar (
  id_agendar int(20) auto_increment primary key not null,
  pais_agendar varchar(50) not null,
  departamento_agendar varchar(50) not null,
  municipio_agendar varchar(50) not null,
  centro_agendar varchar(50) not null,
  fecha varchar(50) not null,
  horario varchar(50) not null,
  foreign key (id_agendar) references citas(id_citas)
) ENGINE=INNODB default CHARSET=LATIN1;