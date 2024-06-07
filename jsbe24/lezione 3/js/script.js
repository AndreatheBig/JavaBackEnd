class Utente{
    constructor(nome,cognome,eta,email,pass,termCond){
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
        this.email=email;
        this.pass=pass;
        this.termCond=termCond;
    }
}

let formReg=document.querySelector("#formReg");
let demo=document.querySelector("#demo");

function validate(){
    demo.innerHTML="";
    //qui raccoldo i valori dei campi

    let inputColorati=document.querySelectorAll("input .borderRed");
    inputColorati.forEach(inputColorati=>{
    inputColorati.removeAttribute("class");
})

    let nome=document.querySelector("#nome").value;
    let cognome=document.querySelector("#cognome").value;
    let eta=document.querySelector("#eta").value;
    let email=document.querySelector("#email").value;
    let pass=document.querySelector("#pass").value;
    let termCond=document.querySelector("#termCond");

    validateName(nome, event);
    validateCognome(cognome,event);
    validateEta(eta,event);
    validateEmail(email,event);
    validatePass(pass,event);

    if(!termCond.checked){
        demo.innerHTML+="<p>non hai spuntato termini e condizioni</p>"
        event.preventDefault();
    }
}
function validateName(nome, event){
    if(nome=="" || nome.length<=2){
        demo.innerHTML+="<p>hai dimenticato il nome</p>";
        document.querySelector("#nome").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}
function validateCognome(cognome, event){
    if(cognome=="" || nome.length<=2){
        demo.innerHTML+="<p>hai dimenticato il cognome</p>";
        document.querySelector("#cognome").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}
function validateEta(eta,event){
    if(eta<18){
        demo.innerHTML+= "Mi spiace non sei abbastanza adulto ";
        document.querySelector("#eta").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}
function validateEmail(email, event){
    let regexEmail=/^[\w-\.]+@([\w-]+\.)+[\w-]{2,5}$/;
    if(!email.match(regexEmail)){
        demo.innerHTML+= "<p>La tua mail non è valida </p>";
        document.querySelector("#email").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}
function validatePass(pass,event){
    let regexpass=/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$/;
    if(!pass.match(regexpass)){
        demo.innerHTML+= "<p>La tua password non è sicura </p>";
        document.querySelector("#pass").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}


formReg.addEventListener("submit",validate);


//recuperare gli elementi 
let elNome=document.querySelector("#nome");
let elCognome=document.querySelector("#cognome");
let elEmail=document.querySelector("#email");
let elEta=document.querySelector("#eta");
let elPass=document.querySelector("#pass");