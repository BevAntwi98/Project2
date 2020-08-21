
function createAnime(){
    //alert("you have selected create")
 //   document.querySelector("form.input").addEventListener("submit",function(e) {

    let completed=false;
    if (document.getElementById("completed").value=="true"){
        completed=true;
    }
        const data = {
            "name": document.getElementById("name").value,
            "rating":document.getElementById("rating").value,
            "completed": completed,
            "notes":document.getElementById("info").value
        }
        fetch("http://localhost:8003/anime/create", {
            method: "POST",
            mode: "cors",
            headers: {
                "Content-Type": "application/Json",
            },
            body: JSON.stringify(data)
        }).then(response => response)
    .then(function (data) {
        alert("I am back")
        console.log(data)
            console.log("JSON response recieved", data);
          
            if(data.status ==200){
        
                let para = document.createElement("span"); // Create a <p> element
                para.className = "alert alert-success col-md-8";
                para.innerHTML= "Book placed on Shelf !";
                let myDiv = document.getElementById("book");
                myDiv.appendChild(para);
            }
        }).catch(function(error) {
        
            console.log("failed to fetch request", error);
        })
    //    });
    }