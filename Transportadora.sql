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
estado varchar(30),
registrado varchar (30) foreign key references usuarioCadastrado (loginUsuario)

primary key (cep, numero, complemento)
)

create table endereco_pacote(
numero varchar(15) foreign key references endereco (numero),
complemento varchar(15) foreign key references endereco (complemento),
cep char(8) foreign key references endereco (cep),
codigo char(12) primary key
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
destinatario char(12) foreign key references endereco_pacote (codigo),
remetente char(12) foreign key references endereco_pacote (codigo),
tipo varchar(30),
valorPacote decimal(7,2),
valorEntrega decimal(7,2),
urgencia varchar(20),
peso decimal(3,2),
dimensoes varchar(20)

primary key (codigo)
)

create table rastreio(
codigo char(12) foreign key references pacote(codigo),
localização varchar(100),
dataOcorrido date
)

create function fn_recebe_pacotes_registrados (@loginUsuario varchar (30))
returns @pacotes table (
codigo char(12),
dataExpedicao date,
dataPrazo date,
tipo varchar(30),
valorPacote decimal(7,2),
valorEntrega decimal(7,2),
urgencia varchar(20),
peso decimal(3,2)
)
as
begin
	insert into @pacotes (codigo, dataExpedicao, dataPrazo, tipo, valorPacote, valorEntrega, urgencia, peso)
	select pc.codigo, pc.dataExpedicao, pc.dataPrazo, pc.tipo, pc.valorPacote, pc.valorEntrega, pc.urgencia, pc.peso from pacote pc
	inner join endereco_pacote ep
	on ep.codigo = pc.codigo
	inner join endereco en
	on en.cep = ep.cep and en.complemento = ep.complemento and en.numero = ep.numero
	where en.registrado = @loginUsuario
	order by dataPrazo
end
return

create function fn_cadastrar_usuario (@nome varchar(10), @sobrenome varchar(30), @telefone char(11), @loginUsuario varchar(30), @senhaUsuario varchar(30), @cnpj char(24), @cpf char(11), @saida varchar(50) output)
as
begin
	insert into usuarioCadastrado values (@nome, @sobrenome, @telefone, @loginUsuario, @senhaUsuario, @cnpj, @cpf)
	set @saida = 'Cadastrado com sucesso!'
end

