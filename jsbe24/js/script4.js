let studente = {
    nome: "dario",
    cognome: "mennillo",
    eta: 35,
    presenza: true,

    salutaDocente: function () {
        return "Ciao Mauro!!";
    }
};
console.log(studente.nome);
console.log(studente.cognome);
console.log(studente.eta);
console.log(studente.presenza);
console.log(studente.salutaDocente());

//accedere con quadra[solo string]
console.log(studente["nome"]);
console.log(studente["cognome"]);
console.log(studente["eta"]);
console.log(studente["presenza"]);
console.log(studente["salutaDocente"]);

function stampaInfo(persona) {

for (const key in persona) {
    if (typeof persona[key] != "function")
    {
        console.log(persona[key]);
    }
}
}

stampaInfo(studente);
