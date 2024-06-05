-- ATTENZIONE: i campi id sono chive primaria, il valore si deve incrementare in automatico

Create table if not exists prodotti(
 id int auto_increment primary key,
 nome varchar(50),
 prezzo decimal(6.2),
 quantita tinyint (100) auto_increment
);

-- istrizione SQL di seguito

alter table prodotti
add  descrizione text
after nome;

-- istrizione SQL di seguito

Create table if not exists ordini(
id int auto_increment primary key,
data_ordine timestamp  default current_timestamp on update current_timestamp,
totale decimal(10.2),
id_cliente int auto_increment
);

-- istrizione SQL di seguito

Create table if not exists clienti(
id int auto_increment primary key,
nome varchar(30),
cognome varchar(30),
email varchar(100) unique,
provincia char(2)
);

-- istrizione SQL di seguito

alter table clienti
modify nome varchar(50),
add telefono tinyint(20)
after cognome;

-- istrizione SQL di seguito

create table if not exists americhe(
id int auto_increment primary key,
stato varchar(50),
capitale varchar(50)
);

create table europa like americhe;
create table africa like americhe ;

-- istrizione SQL di seguito

create table if not exists libro(
id int auto_increment primary key,
titolo varchar(100),
prezzo decimal(6.2),
pagine smallint,
id_editore smallint
);

-- istrizione SQL di seguito

alter table clienti
rename column clienti to customers;

-- istrizione SQL di seguito
