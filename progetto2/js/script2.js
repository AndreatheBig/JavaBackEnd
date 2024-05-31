class Studente {
    constructor(nome, cognome, corso, matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.corso = corso;
        this.matricola=matricola;
    }
}
let btnReg = document.querySelector("#btnReg");
let  lastUser= document.querySelector("#lastUser");
let feed =document.querySelector("#feed");
let studenti =[];

function registra() {
    
    let nome = document.querySelector("#nome").value;
    let cognome = document.querySelector("#cognome").value;
    let corso = document.querySelector("#corso").value;
    let matricola = document.querySelector("#matricola").value;

    feed.innerHTML="";

    if (nome == "" || cognome == "" || corso == ""|| matricola=="") {
        
       
        feed.innerHTML = "<strong> Caro utente, vedi che hai dimenticato qualcosa!</strong>";
    } else { 


        let studente = new Studente(nome, cognome, corso, matricola);

        stampaLastUser(studente);
        studenti.push(studente);
        let allInput = document.querySelectorAll("#formComp input");
        allInput.forEach(input =>{
            input.value="";
        })
    }
}

/**
 * 
 * @param {Studente} studente 
 */
function stampaLastUser(studente) {
lastUser.innerHTML=`
    <p> Nome: ${studente.nome}</p>
    <p> Cognome:${studente.cognome}</p>
    <p> Corso: ${studente.corso}</p>
    <p> Matricola: ${studente.matricola}</p>
    `
}

btnReg.addEventListener("click",registra);

function mostraStudenti(studenti) {
    classe.innerHTML=studenti;
    
}

btnshowStudenti.addEventListener("click", function () {
    let studendiJSON=JSON.stringify(studenti);
    mostraStudenti(studendiJSON);
});


