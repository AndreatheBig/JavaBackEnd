

class User {
    constructor(Username, livello) {
        this.Username = Username;
        this.livello = livello;
    }
}

//input , selezione e tasto start

let btnStart = document.getElementById("btnStart");

function validate() {  //funzione di analisi riempimento e attivazione 
    demo.innerHTML = "";//svuoto e resetto i campi dopo linserimento
    

    let inputColorati = document.querySelectorAll("input .borderRed");//eliminazione errore compilazione
    inputColorati.forEach(inputColorati => {
        inputColorati.removeAttribute("class");
    })

    let Username = document.querySelector("#Username").value;
    one
    
    validateUsername(Username);                         
        
}



function validateUsername(Username) {                       //controllo user
    if (Username == "" || Username.length <= 3) {
        demo.innerHTML += "<p>hai dimenticato il nome, usa almeno 3 caratteri</p>";
        document.querySelector("#Username").setAttribute("class", "borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
        
    }else{
        localStorage.setItem("Username", Username);
    }
}

// ricordati di modificare (aggiungi due bottoni uno facile e uno difficile che facciano partire il sito)

btnStart.addEventListener('click',validate);
