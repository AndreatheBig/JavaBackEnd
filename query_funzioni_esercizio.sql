-- 1) contate il numero di libri editi da mondadori
SELECT count(*)
FROM libri 
JOIN editori 
on libri.editore_id=editori.editore_id where nome='mondadori';


-- 2) calcolate il valore del catalogo libri
SELECT SUM(prezzo)
FROM libri;

-- 3) calcolate età media degli studenti, restituendo un valore intero
select 
	round(avg(timestampdiff(year,data_nascita,curdate())))
from studenti;


-- 4) seleziona gli studenti e l'email creando un attributo in cui rappresentate il nome completo
-- es 'Marco Rossi', 'marco_rossi@gmail.com'
SELECT CONCAT(nome,' ',cognome) nome_intero, email
FROM studenti;

-- 5) sostituite nella tabella studenti gli indirizzi contenenti 'Corso '  con 'Viale '
-- usare funzione REPLACE, attenzione che è case sensitive: 'viale' è diverso da 'Viale'
UPDATE studenti
SET indirizzo = REPLACE(indirizzo, 'corso', 'Viale');

select*from studenti;

-- 6) selezionare nome,cognome,email, data_nascita degli studenti mostrando della data di nascita solo l'anno
select nome,cognome,email, year(data_nascita)
from studenti;

-- 7) selezionare nome,cognome,email, data_nascita degli studenti mostrando la data di nascita nel formato italiano

select nome,cognome,email, DATE_FORMAT(data_nascita,'%d/%m/%Y')
from studenti;

-- 8) selezionate cognome, nome  degli autori e indicate se l'autore è 'Italiano' o 'Straniero'. Usare funzione if 
SELECT cognome, nome , if (nazionalita='it', 'italiano', 'straniero') nazionalita
FROM autori;
	

/*
-- 9)
inserite nella tabella articolo, l'articolo seguente:
descrizione: Canon 7d
specifiche: marca: canon, modello: 7d, schermo: lcd, peso: 1.5 kg, sensore: CMOS, rapporto: 3:2,
 fullframe: no, uscite: hdmi mini, mini jack stero
*/
insert into articoli(descrizione, specifiche)
value(
	'Canon 7d',
    '{"marca": "canon",
		"modello": "7d",
		"pesokg":1.5,
		"sensore":"CMOS",
		"rapporto": "3:2",
		"fullframe": "no",
		"uscite":["hdmi mini", "mini jack stero"]}'
);


-- 10) selezionate dalla tabella articolo la marca, estraendola dalla colonna json

select descrizione,json_extract(specifiche, '$.marca')
from articoli;