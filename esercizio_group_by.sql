-- DB goal2024
-- 1) Contate gli studenti divisi per genere
-- la tabelle risultante mostrerà i seguenti attributi
-- Genere, Quanti

select genere,count(genere) quanti
from studenti
group by genere;

-- 2) Contate gli studenti divisi per genere solo della provincia di Alessandria
-- la tabelle risultante mostrerà i seguenti attributi
-- Genere, Quanti

select genere,count(genere) quanti
from studenti
where provincia= 'al'
group by genere;

-- 3) Contate gli studenti divisi per regione
-- la tabelle risultante mostrerà i seguenti attributi
-- Regione, Quanti

select regione,count(regione) quanti
from studenti
group by regione;

-- 4) Contate gli studenti divisi per regione e per genere
-- la tabelle risultante mostrerà i seguenti attributi
-- Regione, Genere, Quanti

select regione,genere,count(genere) quanti
from studenti
group by genere,regione;

-- 5) Contate gli studenti divisi per regione e per genere mostrando anche i totali aggregati
-- ricordatevi della funzione grouping() e dell'istruzione with rollup
-- la tabelle risultante mostrerà i seguenti attributi, con le righe in più dei subtotali e del totale
-- Regione, Genere, Quanti

SELECT 
	if(grouping(genere),'totale',genereimpiegati),
    IF(GROUPING(regione),
        'totale',
        regione)regione,
    COUNT(*) `quanti`
FROM
    studenti
GROUP BY regione, genere WITH ROLLUP;


-- 6) Contate gli impiegati divisi per ruolo
-- la tabelle risultante mostrerà i seguenti attributi
-- Ruolo, Quanti

select ruolo,count(*) quanti
from impiegati
group by ruolo;



-- DB libro
-- 7) Contate gli autori divisi per nazionalità
-- la tabelle risultante mostrerà i seguenti attributi
-- Nazionalità, Quanti

select nazionalita,count(*) quanti
from autori
group by nazionalita;

-- 8) Contate i libri per editore e il valore dei libri, ordinate per Editore
-- la tabelle risultante mostrerà i seguenti attributi
-- Editore, Quanti, Valore

select nome, count(*)quanti, sum(prezzo)`valore cat`
from editori
join libri
on editori.editore_id=libri.editore_id
group by libri.editore_id
order by nome;