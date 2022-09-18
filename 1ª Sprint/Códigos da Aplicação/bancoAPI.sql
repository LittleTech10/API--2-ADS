CREATE DATABASE API_LittleTech;
use API_LittleTech;

create table login_usuario (
	id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nome_usuario VARCHAR(300),
    email_usuario VARCHAR(400),
    username_usuario VARCHAR(200),
    senha_usuario VARCHAR(20)
    );

create table canais(
	id_canal INT PRIMARY KEY AUTO_INCREMENT,
    nome_canal VARCHAR(300),
    tipo_canal VARCHAR(300),
    padrao_autenticacao VARCHAR(200)
    );
    
select * from canais;
