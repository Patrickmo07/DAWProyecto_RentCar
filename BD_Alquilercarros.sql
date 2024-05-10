drop database if exists bd_alquilercarros;

create database bd_alquilercarros;

use bd_alquilercarros;

create table usuario(
idadmin int NOT NULL auto_increment,
nomadmin varchar(100) not null,
email varchar(200) not null,
contrasena varchar (200) not null,
nombres varchar(100) not NULL,
apellidos varchar(100) not NULL,
primary key (idadmin)
);

create table cliente(
idcliente int NOT NULL auto_increment,
nomcliente varchar (100) not null,
apellcliente varchar(100) not null,
email varchar (300) not null,
telefono varchar (50) not null,
direccion varchar (200) not null,
DNI VARCHAR (8) not null,
Brevete VARCHAR (9) not null,
primary key (idcliente)
);

create table carro (
idcarro varchar (6) not null,
Modelo varchar (100) not null,
Marca varchar (100) not null,
Color varchar (50) not null,
motor VARCHAR (100) not null,
asientos INT NOT NULL,
fecha_fabricacion VARCHAR (10) NOT NULL,
kilometraje int NOT NULL,
tipo_combustible VARCHAR (20) NOT NULL, 
precioxdia INT NOT NULL,
disponibilidad VARCHAR (15) NOT NULL,
PRIMARY KEY (idcarro)
);

create table contrato(
idcontrato int NOT NULL auto_increment,
fk_idcliente INT not null,
fk_idcarro varchar(6) not null, 
fecha_inicio VARCHAR (10)not null, 
fecha_fin VARCHAR (10) not null,
nomcliente varchar(100) not null,
apellcliente varchar(100) not null,
dni varchar(8) not null,
direccion varchar (200) not null,
Modelo varchar (100) not null,
PRIMARY KEY (idcontrato),
FOREIGN KEY(fk_idcliente) REFERENCES cliente(idcliente),
FOREIGN KEY(fk_idcarro) REFERENCES carro(idcarro)
);

create table comentarios(
idcoment INT NOT NULL auto_increment,
fk_idcliente INT not null,
calificacion INT not null,
comentario varchar(255) not null,
fecha_hora VARCHAR (15)not null,
nomcliente varchar(100) not null,
apellcliente varchar (100) not null,
PRIMARY KEY (idcoment),
FOREIGN KEY(fk_idcliente) REFERENCES cliente (idcliente)
);
create  table devolucion(
iddevolucion INT NOT NULL auto_increment,
fecdevolucion VARCHAR (10) not null,
estadodevolucion varchar (20) not null,
fk_idcliente INT not null,
nomcliente varchar (100) not null,
apellcliente varchar (100) not null,
fk_idcarro varchar (6) not null,
Modelo varchar (100) not null,
Marca varchar (100) not null,
PRIMARY KEY (iddevolucion),
FOREIGN KEY(fk_idcliente) REFERENCES cliente (idcliente),
FOREIGN KEY(fk_idcarro) REFERENCES carro(idcarro)
);
create table boleta(
idboleta INT NOT NULL auto_increment,
FECBOLETA varchar (10) not null,
MontoTotal int not null,
fk_idcliente int not null,
nomcliente varchar (100) not null,
apecliente varchar (100) not null,
dni varchar (8) not null,
fk_idcarro varchar (6) not null,
modelo varchar (100) not null,
precioxdia int not null,
primary key (idboleta),
FOREIGN KEY(fk_idcliente) REFERENCES cliente (idcliente),
FOREIGN KEY(fk_idcarro) REFERENCES carro (idcarro)
);
insert into cliente(nomcliente,apellcliente,email,telefono,direccion,DNI,brevete) VALUES
('Federico','Lopez','FedericoLopez@gmail.com','989384898','Av Manco Capac 251','76786875','87856598a'),
('Juan','Rodrigues','JuaRodri@gmail.com','898384989','Av Los Olivos 165','76786875','4787658b'),
('Rodrigo','Martinez','RodriMarciano@gmail.com','384884968','Av Peru 51','75869862','83356578d'),
('Martin','Sanchez','SanchoElGrande@gmail.com','776667889','Av Argentina 121','65638992','87863521f'),
('Jimmy','McCarran','ForlornHope@outlook.com','987678205','Av Venezuela 213','76542878','56382991k');
insert into carro VALUES 
('982WX3','Honda Civic','Honda','Blanco','2.0-liter non-turbo four-cylinder',5,'10/10/2010',50,'GLV',150,'Disponible'),
('7W599E','Honda Civic','Honda','Negro','2.0-liter non-turbo four-cylinder',5,'10/10/2010',100,'GLV',100,'No Disponible'),
('9543DP','Arizzo 5 GT','Cherry','Rojo','China-V standard Acteco SQRE4T15B 1.5T ',5,'11/05/2016',110,'GLP',250,'No Disponible'),
('983WX3','Arizzo 5 GX','Cherry','Azul','China-V standard Acteco SQRE4T15B 1.5T',5,'10/01/2017',50,'GLP',500,'Disponible'),
('787WQX','Elantra Touring','Hyundai','Gris','triple',5,'10/10/2005',5000,'GLV',50,'No Disponible');
insert into contrato VALUES 
(1,'11','7W599E','01/05/2024','10/05/2024','Federico','Lopez','98938498','Av Manco Capac 251','Honda Civic'),
(2,'12','9543DP','30/04/2024','20/05/2024','Juan','Rodrigues','89838989','Av Los Olivos 165','Arizzo 5 GT'),
(3,'15','787WQX','31/04/2024','10/05/2024','Rodrigo','Martinez','38884968','Av Peru 51','Elantra Touring');
insert into comentarios VALUES
(101,13,4,'El auto se encontraba en excelente estado de acuerdo  a las especificaciones,sin embargo el proceso de alquiler y la solucion de problemas llegaban a tardar','03/05/2024','Martin','Sanchez'),
(102,13,5,'Excelente servicio, lo volver�a a usar','03/05/2024','Jimmy','McCarran'),
(103,14,3,'Muy atentos y confiables','05/05/2024','Rodrigo','Martinez');
insert into devolucion (fecdevolucion,estadodevolucion,fk_idcliente,nomcliente,apellcliente,fk_idcarro,Modelo,Marca) VALUES 
('03/05/2024','Buen Estado',14,'Martin','Sanchez','982WX3','Honda Civic','Honda'),
('30/04/2024','Buen Estado',15,'Jimmy','McCarran','983WX3','Arizzo 5 GX','Cherry');
insert into boleta (FECBOLETA,MontoTotal,fk_idcliente,nomcliente,apecliente,dni,fk_idcarro,modelo,precioxdia) VALUES
('01/05/2024',1000,11,'Federico','Lopez','98938898','7W599E','Honda Civic',100),
('30/04/2024',5250,12,'Juan','Rodrigues','89834989','9543DP','Arizzo 5 GT',250),
('31/04/2024',550,13,'Rodrigo','Martinez','38884968','787WQX','Elantra Touring',50);
