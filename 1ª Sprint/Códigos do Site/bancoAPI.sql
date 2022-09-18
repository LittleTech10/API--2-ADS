create database API_LittleTech;
use API_LittleTech;

create table usuario(
	id_usuario int not null primary key AUTO_INCREMENT,
    nome_usuario varchar(50) not null,
    email_usuario varchar(50) not null,
    username_usuario varchar(50) not null,
    senha_usuario varchar(50) not null
    );

create table canais(
	id_canal int not null primary key AUTO_INCREMENT,
    nome_canal varchar(50) not null,
    tipo_canal varchar(50) not null,
    padrao_autenticacao varchar(50) not null
    );

select * from usuario;
select * from canais;