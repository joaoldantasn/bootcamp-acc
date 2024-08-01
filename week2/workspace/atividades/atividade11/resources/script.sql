create database biblioteca;

create table livros(
id int not null auto_increment primary key,
titulo varchar(100),
autor varchar(100),
ano_publicacao int
)