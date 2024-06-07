function auto(marca,modello,cilindrata,marcia) {
    this.marca=marca;
    this.modello=modello;
    this.cilindrata=cilindrata;
    this.marcia=marcia;

    this.info=function(){
        return"automobile: "+this.marca+" "+this.modello+" "+this.cilindrata+" "+this.marcia;
    }
    
}

let auto = new auto("volvo", "xc90", 2000,6);
let auto = new auto("lancia", "delta", 1600,5);
let auto = new auto("peugeot", "3008", 1600,5);

console.log(auto1.info());
console.log(auto2.info());
console.log(auto3.info()); 

class Moto{
    constructor(marca,modello,cilindrata,velocita){
        this.marca=marca;
        this.modello=modello;
        this.cilindrata=cilindrata;
    }
static tipologia="motocicletta"

    accendi(){
        return"vroooooom";
    }
        getMarca(){
            return this.marca;
        }
        static calcolaDifVel(m1,m2){
            let differenza=m1.velocita-m2.velocita;
            return differenza;
        }
    }

    let miaMoto=new Moto("kawasaki","z750",750,300);
    console.log(miaMoto.accendi());
    console.log(miaMoto.marca+""+miaMoto.modello);
    console.log(miaMoto.tipologia);
    console.log(Moto.tipologia);

    let tuaMoto=new Moto("piaggio","ciao",49,35);
    console.log(miaMoto.accendi());
    console.log(miaMoto.marca+""+miaMoto.modello);
    console.log(miaMoto.tipologia);
    console.log(Moto.tipologia);


