class User {
    constructor(Username, livello) {
        this.Username = Username;
        this.livello = livello;
    }
}

let Username = document.querySelector("#Username");
let livello = document.querySelectorAll('input[name="livello"]');
let btnStart = document.querySelector("#btnStart");

function validate() {
    demo.innerHTML = "";


    let inputColorati = document.querySelectorAll("input .borderRed");
    inputColorati.forEach(inputColorati => {
        inputColorati.removeAttribute("class");
    })

    let Username = document.querySelector("#Username").value;
    let livello = document.querySelector("input[type=radio][name=livello]:checked").value;
    
    validateUsername(Username, event);


    if (livello == null) {
        demo.innerHTML += "<p>non hai scelto il livello</p>"
        event.preventDefault();
        location.replace("./quizzettone/page01.html")
    }
}

function validateUsername(Username, event) {
    if (Username == "" || Username.length <= 3) {
        demo.innerHTML += "<p>hai dimenticato il nome, usa almeno 3 caratteri</p>";
        document.querySelector("#Username").setAttribute("class", "borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}


btnStart.addEventListener("click",validate);


