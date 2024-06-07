let saluto = "Ciao Mondo";
console.log(saluto);
let mioNome ="Andrea Mattei";
let eta = 31;
let presenza = true;
var corso ="JavabackEnd";

console.log("Ciao, sono "+mioNome+" ,età " + eta + " corso "+corso+" presenza: "+presenza);

let miaVariabile = 40;
console.log(miaVariabile);

miaVariabile = 41;
console.log(miaVariabile);

miaVariabile = "un numero a caso";
console.log(miaVariabile);

let numero1 = 5;
let numero2 = 9;

let somma =numero1+numero2;

console.log("la somma tra i valori è:"+somma );
console.log(typeof numero1);
console.log(typeof 0.3854354212138543215);
console.log(typeof true);
console.log(typeof "ciao come stai");

let valoreNull=null;
console.log(valoreNull);
console.log(typeof valoreNull);

let colori=["giallo","rosso","verde","blu"];
colori.push("Arancione");

colori.sort();
colori.pop();
console.log(colori);

for(let i =0; i<colori.length; i++){
    console.log(colori[i]);
};

colori.forEach(colore => {
    console.log(colore);
});

for (const colore in colori) {
    console.log(colori[colore]);
    };

for (let i of colori) {
    console.log(colori[i]);
}    
