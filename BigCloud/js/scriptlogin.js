const URL_endpoint = "http://localhost:9179/api/";


class Utente{
    constructor(username,pass){
        this.username=username;        
        this.pass=pass;        
    }
}

let formLogin=document.querySelector("#formReg");
let lg=document.querySelector("#lg");

function validate(){
    lg.innerHTML="";
    //acquisizione controllo
    
    let inputColorati=document.querySelectorAll("input .borderRed");
    inputColorati.forEach(inputColorati=>{
        inputColorati.removeAttribute("class"); 
    })
    let username=document.querySelector("#username").value;    
    let pass=document.querySelector("#pass").value;   
    
    
    if(validateUsername(username,event) && validatePass(pass,event)){
        login(username, password);
    };
    
}
    
function login(username, password){
    URL = URL_endpoint+`utente/login/${username}&${password}`;
    fetch(URL)
    .then(data => {
        return data.json(); //il metodo json() converte il json in obj
    }
    )
    .then(response => {
        localStorage.setItem("userConnesso", JSON.stringify(response));        
        location.href = "./home.html";
    })        
    
    
};   

function validateUsername(username,event){
    if(username==""|| username.length<=2){
        demo.innerHTML+= "<p>hai dimenticato l'username</p> ";
        document.querySelector("#username").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }else{
        return true;
    }
}

function validatePass(pass,event){
    
    if(pass==""){
        demo.innerHTML+= "<p>hai dimenticato la password</p>";
        document.querySelector("#pass").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }else{
        return true;
    }
}



formLogin.addEventListener("submit",validate);


//recuperare gli elementi 
let elUsername=document.querySelector("#username");
let elPass=document.querySelector("#pass");