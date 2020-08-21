//SHOWALL
function showAll() {
    fetch('http://localhost:8003/game/showAll')
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
        let myDiv = document.getElementById("showGame");
        for (let i = 0; i < 200; i++) {
            // console.log(
            // (document.querySelector("#read").innerHTML = data[i].name)
            // );
            let table=document.getElementsByClassName("table table-striped");
            let para = document.createElement("P"); // Create a <p> element
            let name = document.createElement("span"); // Create a <p> element
            let year = document.createElement("span");
            let rating= document.createElement("span"); // Create a <p> element
            let notes=document.createElement("span");


            name.className = "table table-striped";
            name.innerHTML= data[i].name;

            rating.className = "table table-striped";
            rating.innerHTML="........."+data[i].rating;

            year.innerHTML= data[i].year;
            
            notes.innerHTML="............."+data[i].notes;

            para.append(name);
            para.append(rating);
            para.append(year);
            para.append(notes)
            
           // para.innerText = `Anime info: ${(document.querySelector("#read").innerHTML = data.results[i].createAnime)}`;


            myDiv.appendChild(para);
        }
        });
    }
    )
    .catch(function(err) {
    console.log('Fetch Error :-S', err);
    })}

    //DELETE by id
    function deleteAnEntry(){
            id=document.getElementById("deleteID").value;
            fetch(`http://localhost:8003/game/delete/${id}`, {method:'DELETE'})
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
    
    
