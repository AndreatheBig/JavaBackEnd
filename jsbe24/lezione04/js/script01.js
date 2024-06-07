const url="https://reqres.in/api/users?page=2";

//utilizzo fetch api
//applico il metodo get


let utenti=[]
let elListaUtenti=document.querySelector("#listaUtenti")


fetch(url)
    .then(data=>{
        console.log(data);
        return data.json();
    })
    .then(response=>{
        console.log(response);
        response.data.forEach(user => {
            console.log(user.first_name+" "+user.last_name);
            elListaUtenti.innerHTML+=stampaInfoUser(user);

        });

        utenti=response.data;

    })

    function stampaInfoUser(user){
        let info=`
        <li>
            <p>Nome${user.first_name}</p>
            <p>Cognome${user.last_name}</p>
            <img src='${user.avatar}'
        </li>  
        `
        return info;
    }