
//  let createAnime=document.querySelector ("#create");

function create() {
    alert("I am create")
    const data = {
        "name": "AAA",
        "rating":"7.5",
        "completed": "true",
        "notes":"good anime"
    }
    fetch("http://localhost:8003/anime/create", {
            method: "POST",
            mode: "cors",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(data)
        }).then(
    function(response) {
        if (response.status !== 200) {
        console.log('And I Oop! Looks like there was an issue . Status Code: ' +
            response.status);
        return;
        }

        then(response => response.json())
        .then(json => console.log(json));
    }
    )
    .catch(function(err) {
    console.log('Fetch Error :-S', err);
    })}

function showAll() {
        fetch('http://localhost:8003/anime/showAll')
        .then(
        function(response) {
            if (response.status !== 200) {
            console.log('And I Oop! Looks like there was an issue . Status Code: ' +
                response.status);
            return;
            }
    
            // Examine the text in the response
            response.json().then(function(data) {
            console.log(data);
            let myDiv = document.getElementById("showAnime");
            for (let i = 0; i < 200; i++) {
                // console.log(
                // (document.querySelector("#read").innerHTML = data[i].name)
                // );
                
                let para = document.createElement("P"); // Create a <p> element
                let name = document.createElement("span"); // Create a <p> element
                let rating= document.createElement("span"); // Create a <p> element
                let completed= document.createElement("span");
                let notes=document.createElement("span");
                let mytable=document.getElementById("table");


                name.className = "table table-striped";
                name.innerHTML= data[i].name;
                rating.className = "table table-striped";
                rating.innerHTML=".................."+data[i].rating;
                completed.innerHTML="......................"+data[i].completed;
                notes.innerHTML="............."+data[i].notes;

                para.append(name);
                para.append(rating);
                para.append(completed);
                para.append(notes)
                
               // para.innerText = `Anime info: ${(document.querySelector("#read").innerHTML = data.results[i].createAnime)}`;
    
 
                myDiv.appendChild(para);
            }
            });
        }
        )
       
}


function deleteAnEntry(){
    id=document.getElementById("deleteID").value;
    fetch(`http://localhost:8003/anime/delete/${id}`, {method:'DELETE'})
        .then(
        function(response) {
            if (response.status !== 200) {
            console.log('And I Oop! Looks like there was an issue . Status Code: ' +
                response.status);
            return;
            }
            then(res => res.json()) // orres.text() 
            .then(res => console.log(res))
            console.log("id" + id + "deleted");
        })}
    
    
