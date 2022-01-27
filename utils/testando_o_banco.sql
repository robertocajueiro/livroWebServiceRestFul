# criando a tabela carro 
create table carro (
	id bigint not null auto_increment,
    nome varchar(255),
    descricao varchar(255),
    url_foto varchar(255),
    url_video varchar(255),
    latitude varchar(255),
    longitude varchar(255),
    tipo varchar(255),
    
    primary key (id) 
    );

# populando o banco
insert into carro(nome, descricao, url_foto, url_video, latitude, longitude, tipo)
values(
	'Ferrari FF', 
	'Descrição da Ferrari FF', 
	'http://www.livroandroid.com.br/livro/carros/esportivos/Ferrari_FF.png',
	'http://www.livroiphone.com.br/carros/esportivos/ferrari_ff.mp4',
	'44.52218',
	'10.864019',
	'esportivo');
    
# importando o dump
# sintaxe: mysql -u usuario -p banco_de_dados > arquivo_backup.sql

