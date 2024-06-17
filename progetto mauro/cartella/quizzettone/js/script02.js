const URL='/api/paesirandom';


fetch(URL)
    .then(paesi = JSON.parse(Array))    
        .then(paesi=>{
            for(const paese of paesi){
                quiz.domanda=paese.nome
                quiz.risposte.push(paese.capitale)
            }
            quiz.risposta=quiz.risposta[2]
            quiz.risposte.sort()
            document.querySelector('.domanda').textContent=quiz.domanda
            document.querySelector('#box1').textContent=quiz.risposte[0]
            document.querySelector('#box2').textContent=quiz.risposte[1]
            document.querySelector('#box3').textContent=quiz.risposte[2]
            document.querySelector('#risposta').textContent=quiz.risposta
        })

    
    
    
        

// function recuperaDati(){
//     fetch(URL)
//         .then(paesi => {
//             for (const paese of paesi){
//                 quiz.domanda= paese.nome
//                 quiz.risposte.push(paese.capitale)    
                
//             }
//         })
//         quiz.risposta=quiz.risposte[2];
//         quiz.risposte.sort();
//         document.querySelector('.domanda').textContent=quiz.domanda;
//         document.querySelector('#box1').textContent=quiz.risposte[0];
//         document.querySelector('#box1').textContent=quiz.risposte[1];
//         document.querySelector('#box1').textContent=quiz.risposte[2];
//         document.querySelector('#risposta').textContent=quiz.risposta;

//     }

let btnsuca=document.querySelector("#btnsuca");


btnsuca.addEventListener('click',recuperaDati);

