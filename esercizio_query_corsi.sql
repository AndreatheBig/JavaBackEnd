/* 1
Seleziona cognome, nome, email dei docenti
e titolo corso che insegnano
e ordina per cognome e nome
*/
select cognome, nome, email, titolo
from docenti d, corsi c
where d.id=c.docente_id
order by cognome, nome;

/* 2
Seleziona cognome, nome, email dei docenti
e titolo corso che costa meno di 200€(esclusi)
e ordina per cognome e nome
*/
select cognome, nome, email, titolo
from corsi c, docenti d 
where d.id=c.docente_id 
and c.prezzo<'200'
order by cognome, nome;
/* 3
Seleziona cognome, nome, email del docente
che insegna nel corso HTML
*/
select cognome, nome, email
from corsi c, docenti d
where d.id=c.docente_id 
and c.titolo='html';
/* 4
Seleziona titolo corso/i insegnati dal docente il cui cognome è Verdi
e ordina per titolo corsi
*/
select titolo
from corsi c, docenti d
where d.id=c.docente_id 
and d.cognome='verdi'
order by titolo;
/* 5
Seleziona cognome, nome, email del/dei docente/i
che insegnano nei corsi il cui titolo comincia per 'Introduzione'
e ordina per titolo, cognome e nome
*/
select cognome, nome, email
from corsi c, docenti d
where d.id=c.docente_id 
and c.titolo LIKE 'introduzione%'
order by cognome, nome;
/* 6
Seleziona cognome, nome, email, degli studenti 
e titolo del corso a cui sono iscritti
e ordina per cognome e nome
*/
select cognome, nome, titolo, email
from studenti s, corsi c, iscrizioni i
where i.studente_id=s.id
and i.corso_id=c.id
order by cognome,nome;
/* 7
Seleziona cognome, nome, email, degli studenti FEMMINA
e titolo corso a cui sono iscritte
e ordina per cognome e nome
*/
select cognome, nome, titolo, email
from studenti s, corsi c, iscrizioni i
where i.studente_id=s.id
and i.corso_id=c.id
and genere='f'
order by cognome,nome;
/* 8
Seleziona cognome, nome, email, degli studenti
iscritti al corso di Java
e ordina per cognome e nome
*/
select cognome, nome, email
from studenti s, corsi c, iscrizioni i
where i.studente_id=s.id
and i.corso_id=c.id
and titolo='java'
order by cognome,nome;
/* 9
Seleziona cognome, nome, email, degli studenti MASCHI
iscritti al corso di Basi di dati
e ordina per cognome e nome
*/
select cognome, nome, email
from studenti s, corsi c, iscrizioni i
where i.studente_id=s.id
and i.corso_id=c.id
and genere='m'
and titolo='Basi di dati'
order by cognome,nome;
/* 10
Seleziona cognome, nome, email, degli studenti
iscritti a corsi per i quali hanno pagato più di 200€(compresi)
e ordina per cognome e nome
*/
select cognome, nome, email, titolo
from corsi c, docenti d 
where d.id=c.docente_id 
and c.prezzo>='200'
order by cognome, nome;