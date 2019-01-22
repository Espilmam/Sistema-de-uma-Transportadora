create database Transportadora
go
use Transportadora

create table funcionario(
registroInterno int,
nome varchar(10),
sobrenome varchar(30),
cpf char(11),
funcao varchar(20)

primary key (registroInterno)
)

create table usuarioCadastrado(
nome varchar(10),
sobrenome varchar(30),
telefone char(11),
loginUsuario varchar(30),
senhaUsuario varchar(30),
cnpj char(24),
cpf char(11)

primary key (loginUsuario)
)

create table usuarioCadastrado_pacote (
cnpj char(24) foreign key references usuarioCadastrado(cnpj),
cpf char(11) foreign key references usuarioCadastrado(cpf),
codigo char(12) foreign key references pacote(codigo)
)

create table endereco(
logradouro varchar(50),
numero varchar(15),
complemento varchar(15),
cep char(8),
bairro varchar(50),
cidade varchar(50),
estado varchar(30)

primary key (cep, numero, complemento)
)

create table endereco_pacote(
numero varchar(15) foreign key references endereco (numero),
complemento varchar(15) foreign key references endereco (complemento),
cep char(8) foreign key references endereco (cep),
codigoendereco int identity (1,1) primary key
)

create table endereco_usuarioCadastrado(
numero varchar(15) foreign key references endereco (numero),
complemento varchar(15) foreign key references endereco (complemento),
cep char(8) foreign key references endereco (cep),
loginUsuario varchar(30) foreign key references usuarioCadastrado (loginUsuario)
)

create table pacote(
codigo char(12),
dataExpedicao date,
dataPrazo date,
destinatario int foreign key references endereco_pacote (codigoendereco),
remetente int foreign key references endereco_pacote (codigoendereco),
tipo varchar(30),
valorPacote decimal(7,2),
valorEntrega decimal(7,2),
urgencia varchar(20),
peso decimal(3,2),
dimensoes varchar(20)

primary key (codigo)
)

create table rastreio(
codigo char(12) foreign key pacote(codigo),
localização varchar(100),
dataOcorrido date
)

