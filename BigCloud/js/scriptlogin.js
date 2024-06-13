class Utente{
    constructor(username,pass){
        this.username=username;        
        this.pass=pass;        
    }
}

let formLogin=document.querySelector("#formReg");
let lg=document.querySelector("#reg");

function validate(){
    lg.innerHTML="";
    //acquisizione controllo

    let inputColorati=document.querySelectorAll("input .borderRed");
    inputColorati.forEach(inputColorati=>{
    inputColorati.removeAttribute("class");
})
    let username=document.querySelector("#username").value;    
    let pass=document.querySelector("#pass").value;   
    

    validateUsername(username,event);    
    validatePass(pass,event);
    
   
}
function validateUsername(username,event){
    if(username==""|| username.length<=2){
        demo.innerHTML+= "<p>hai dimenticato l'username</p> ";
        document.querySelector("#username").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}

function validatePass(pass,event){
    
    if(pass==""){
        demo.innerHTML+= "<p>hai dimenticato la password</p>";
        document.querySelector("#pass").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}
function getUsername(){
    fetch(URL)
    .then(data => {
        return data.json(); //il metodo json() converte il json in obj
    }
    )
    .then(response => {
                localStorage.setItem("userConnesso", JSON.stringify(response));
        
            });

    // inserisci la costante url
}


formLogin.addEventListener("submit",validate);


//recuperare gli elementi 
let elUsername=document.querySelector("#username");
let elPass=document.querySelector("#pass");