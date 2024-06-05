SELECT * FROM goal2024.studenti;

-- ordina come vuoi
select cognome, data_nascita , email 
from studenti;

--

select * from studenti
where genere = "f"; -- selezione 

select cognome, data_nascita , email
from studenti
where genere = "f"; -- congiunzione

select cognome, data_nascita , email
from studenti
order by cognome desc;

truncate studenti;

-- ordina per 
select * from studenti
order by cognome, nome;

-- limit
select * from studenti
order by cognome, nome
limit 10;

select * from studenti
order by cognome, nome
limit 10/*indice di partenza*/, 10 /*numero record */;

-- where
select * from studenti
where genere = "f"
order by cognome,nome
limit 30;

select * from studenti
where citta != "torino"
order by citta;

select * from studenti
where data_nascita >= "1990-01-01"
order by data_nascita;

-- and or
select * from studenti
where genere = "f" and provincia = "to"
order by cognome;

select * from studenti
where genere = "f" or provincia = "to"
order by cognome;

select * from studenti
where cognome = "rossi" or cognome = "verdi" and provincia = "to"
order by cognome;

select * from studenti
where( cognome = "rossi" or cognome = "verdi") and provincia = "to"
order by cognome;