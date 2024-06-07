class Studente{
    constructor(nome, cognome,corso, matricola){
        this.nome=nome;
        this.cognome=cognome;
        this.corso=corso;
        this.matricola=matricola;
    }
}

let classe= document.querySelector("#classe");
let btnReg=document.querySelector("#btnReg");
let btnShowStudenti=document.querySelector("#btnShowStudenti");
let elencoStudenti = [];

function registra(){
    let nome = document.querySelector("#nome").value;
    let cognome = document.querySelector("#cognome").value;
    let corso = document.querySelector("#corso").value;
    let matricola = document.querySelector("#matricola").value;

    if (nome==""|| cognome==""||corso==""||matricola==""){

        event.preventDefault();
        classe.innerHTML="Non hai compilato tutti i campi"
     }else{
        
    
        let studente=new Studente(nome, cognome,corso, matricola);
        console.log(studente);
        elencoStudenti.push(studente);
     }  
    
     
}

/**
 * 
 * @param {Object[]} studenti 
 */
function stampaStudenti(studenti){
    elencoStudenti = studenti;
    for(i=0; i<=studenti.length; i++){
        console.log(studenti[i]);
    }

}


btnReg.addEventListener("click",registra);