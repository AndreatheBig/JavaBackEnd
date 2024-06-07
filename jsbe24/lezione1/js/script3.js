//voglio scrivere all'interno di demo

//1.recupero il div con id = a demo
// let demo =document.getElementById("demo");

// demo.innerHTML="Ciao, mondo!!!";

// faccio la stessa cosa utilizzando le funioni
// demo = variabile locale 
function saluta() {
    let demo = document.getElementById("demo");
    demo.innerHTML="Ciao, mondo!!!";    
}
// richiamo una funzione
saluta();
// il richiamo di una funzione è indipemdente dalla sua dichiarazione

function salutaStudente() {
    let demo = document.getElementById("demo");
    let nome= "Maria ";
    demo.innerHTML="Ciao,"+nome;
}
salutaStudente();

// funzione da un altra funzione 
function agiungiParole() {
    let feed= document.getElementById("feed");
    feed.innerHTML="queste sono le prime parole";    
    aggiungiAltreParole(feed);
}
/**
 * 
 * @param {HTMLElement} elementoHtml 
 */
function aggiungiAltreParole(elementoHtml) {
    elementoHtml.innerHTML+=", questo è il resto delle parole"
    
}
agiungiParole();

//osservazione: var globali o locali
// console.log(nome);

let mioNome="dario";

function prendiNome() {
    let mioNome ="anna";
    console.log(mioNome);
   
}

//esempio
let numeri=[34,15,22,10,1,3,8];

    function calcolaPari(numero) {
        if(numero%2==0){
            return numero;
        }else{
            return"dispari";
       }        
    }
let numclick=0;

    function eseguiCalcolo() {
        numclick++;
        if(numclick<=10){
        numeri.forEach(numero=>{
            console.log(calcolaPari(numero));
            gioco.innerHTML+="<li>"+calcolaPari(numero)+"</li>";
        });
    }else{
        Window.location.href = 'https://www.disney.it/';
    }  
    }

    let gioco=document.getElementById("gioco");

    let btn=document.getElementById("btn");
    btn.addEventListener("click",eseguiCalcolo);



