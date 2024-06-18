const URL="http://localhost:9036/api/paesirandom";


let Username= "";
let elUsername = document.querySelector("#elUsername");
let capitali=[];
let domanda="";
let risultati="";
let punteggio = 0;


function prendiProdotti(){
    Username=localStorage.getItem("Username");
    elUsername.innerHTML = Username;
    console.log(Username);    
    capitali = [];
    why.innerHTML = "";
    domanda = "";
    risultati="";

        fetch(URL)    
            .then(ris=>{
                
                return ris.json();
            })
            .then(dati=>{
                let numrandom=Math.floor(Math.random()*2);
                domanda=dati[numrandom];
                console.log(domanda);
                dati.forEach(obj => {

                    console.log(obj);
                    capitali.push(obj.capitale);
                });
                for(i=0; i<dati.length; i++){
                    risp[i].value=dati[i].capitale;
                    labs[i].textContent = dati[i].capitale;
                }
                why.innerHTML+=`<li>${domanda.paese}</li>`
            });
}

let focus = document.querySelector("#focus");

function controllo(){
    focus.innerHTML="";
    try {
        let risp = document.querySelector("input[type=radio][name=risp]:checked").value;
        
        console.log(risp);
        if (risp == "") {                    //controllo se hai risposte
            focus.innerHTML += "<p>non hai selezionato nessuna risposta</p>"
            event.preventDefault();        
        }else{
            focus.innerHTML = "";
            risp =  document.querySelector("input[type=radio][name=risp]:checked").value;
        }
        if(domanda.capitale==risp){       //controllo se hai risposto giusto
            focus.innerHTML+=`<p>hai indovinato +1</p>`;
            punteggio++;
            punt.innerHTML=`<p>Punteggio ${punteggio}</p>`;
            
        }else{
            focus.innerHTML+=`<p>non hai indovinato</p>`
        }
        //dovrebbe resettare i campi input
        document.getElementById('btnnext').addEventListener('click', function () {
            ["risp0", "risp1", "risp2"].forEach(function(id) {                  
                document.getElementById(id).checked = false;
            });
            return false;
        });
    } catch (error) {
        focus.innerHTML += "<p>non hai selezionato nessuna risposta</p>"
    }
    }
    
let risp = document.querySelectorAll('input[name="risp"]');
console.log(risp);
let labs = document.querySelectorAll("label");
console.log(labs);


let why=document.querySelector("#why");
let btnnext=document.querySelector("#btnnext");
let btnrispondi=document.querySelector('#btnrispondi');

window.addEventListener("DOMContentLoaded",prendiProdotti)
btnnext.addEventListener('click',controllo);
btnnext.addEventListener('click',prendiProdotti);
