let elNomeUser = document.querySelector("#elNomeUser");

let nomeUser = "";

function recuperaDati(){
    //recupera vari dati tra cui lo username

    // user = JSON.parse( localStorage.getItem("userConnesso"));   
    // username= user.username
    // elNomeUser.innerHTML = nomeUser;
}

window.addEventListener("DOMContentLoaded", recuperaDati)


let btnBrani = document.querySelector("#btnBrani");
let box3 = document.querySelector("#box3");

function recuperaBrani(){
    const URL_endpoint = "http://localhost:9179/api/";
    URL_ListaCanzoni = URL_endpoint + "canzoni";

    fetch(URL_ListaCanzoni)
    .then(data => {
        console.log(data);
        return data.json();
    })
    .then(response => {
       console.log(response); 
       response.forEach(canzone => {
         console.log(canzone.titolo);
         box3.innerHTML += stampaCanzone(canzone);
       });
    })
}
function stampaCanzone(canzone) {
    let brano = `<li>
        <span>${canzone.artista} - ${canzone.titolo}</span>
    </li>`;
    return brano;

}

btnBrani.addEventListener("click", recuperaBrani);