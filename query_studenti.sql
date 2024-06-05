
select cognome,nome,email from studenti
where cognome = "verdi"
order by nome;

select cognome,nome,email,data_nascita from studenti
where genere = "f"
order by cognome,nome;

select cognome,nome,email,citta,data_nascita from studenti
where citta != "torino"
order by cognome,nome;

select cognome,nome,email,data_nascita from studenti
where data_nascita >= '2000-01-01'
order by data_nascita desc;

select cognome,nome,email,data_nascita from studenti
where genere = "m" and provincia = "al"
order by cognome,nome;

select cognome,nome,email,data_nascita,provincia 
from studenti
where provincia in  ("at","no")
order by provincia,cognome,nome;

select * from studenti
order by provincia;

select cognome,nome,email,data_nascita from studenti
where provincia in ("cn","at","no","al")
order by cognome,nome;

select cognome,nome,email,data_nascita from studenti
where data_nascita between "1990-01-01"and "1999-12-31" 
and genere = "f"
order by data_nascita desc ,
cognome,nome;

select cognome,nome,email,data_nascita from studenti
where data_nascita not between "1990-01-01"and "1999-12-31"
and genere = "f"
order by data_nascita desc,
cognome,nome;
  
select cognome,nome,email,data_nascita from studenti
where cognome like "r%"
order by cognome,nome;

select cognome,nome,email,data_nascita from studenti
where cognome regexp "^ve|^de"
order by cognome,nome;


/*
11
seleziona il cognome, il nome, l'email e la data di nascita
dalla tabella studenti
il cui cognome inizia per 've' o 'de' e ordina per cognome e nome
*/