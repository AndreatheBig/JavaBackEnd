class Utente{
    constructor(Username, email,dataNascita){
        this.Username=Username;
        this.email=email;
        this.dataNascita=dataNascita;
    }
}

// # è il mio simbolo per l'id
// querryselector recuper un solo elemento
let mioForm = document.querySelector("#mioForm");
let demo= document.querySelector("#demo");
// creo la funzione di validazione 
function validate() {
let Username= document.querySelector("#Username").value;
let email= document.querySelector("#email").value;
let dataNascita= document.querySelector("#dataNascita").value;

if (Username==""|| email==""||dataNascita==""){

    event.preventDefault();
    demo.innerHTML="caro utente"
 }else{
    // let utente={
    //     username:Username,
    //     email:email,
    //     dataNascita:dataNascita
    // }

    let utente=new Utente(Username,email,dataNascita);
    console.log(utente);
    registraUtente(utente);
 }   
}   
/**
 * 
 * @param {Utente} utente 
 */
function registraUtente(utente){
    let utenteJSON = JSON.stringify(utente);
    //questo utente verra inviato ad un endpoint
    console.log(utenteJSON);
}
    
mioForm.addEventListener("submit", validate);
