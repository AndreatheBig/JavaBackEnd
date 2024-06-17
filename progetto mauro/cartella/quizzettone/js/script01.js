const URL=""

class User {
    constructor(Username, livello) {
        this.Username = Username;
        this.livello = livello;
    }
}

let Username = document.querySelector("#Username");               //input , selezione e tasto start
let livello = document.querySelectorAll('input[name="livello"]');
let btnStart = document.getElementById("btnStart");

function validate() {  //funzione di analisi riempimento e attivazione 
    demo.innerHTML = "";//svuoto e resetto i campi dopo linserimento


    let inputColorati = document.querySelectorAll("input .borderRed");//eliminazione errore compilazione
    inputColorati.forEach(inputColorati => {
        inputColorati.removeAttribute("class");
    })

    let Username = document.querySelector("#Username").value; // user
    let livello = document.querySelector("input[type=radio][name=livello]:checked").value; // selezione
    
    validateUsername(Username, event);                           /** sto cercando di capire come far */
   // btnStart.location.replace("./quizzettone/page01.html")     /**    sunzionare il fottuto bottone */

    if (livello == null) {                    //controllo campo livello
        demo.innerHTML += "<p>non hai scelto il livello</p>"
        event.preventDefault();
        
    }
}
function getutente(){
        fetch(URL)
        .then(data => {
            return data.json(); //il metodo json() converte il json in obj
        }
        )
        .then(response => {
                    localStorage.setItem("userConnesso", JSON.stringify(response));        
                })        
    }

function validateUsername(Username, event) {                       //controllo user
    if (Username == "" || Username.length <= 3) {
        demo.innerHTML += "<p>hai dimenticato il nome, usa almeno 3 caratteri</p>";
        document.querySelector("#Username").setAttribute("class", "borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}



btnStart.addEventListener('click',validate);
