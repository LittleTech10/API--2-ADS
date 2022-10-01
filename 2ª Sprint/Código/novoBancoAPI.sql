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

create table configuracao_canais_token(
	id_canal_token int not null primary key AUTO_INCREMENT,
    nome_canal_token varchar(50) null,
    id_conta_token varchar(50) null,
    token_canal varchar(50) null
    );
    
create table configuracao_canais_usuario(
	id_canal_usuario int not null primary key AUTO_INCREMENT,
    nome_canal_usuario varchar(50) null,
    id_conta_usuario varchar(50) null,
    usuario_canal varchar(50) null,
    senha_canal varchar(50) null
    );
    
select * from usuario;
select * from canais;
select * from configuracao_canais_token;
select * from configuracao_canais_usuario;
