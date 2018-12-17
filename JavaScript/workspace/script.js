
function showNewsHeading(){
    var newsHeading = document.getElementById("news-list");
    console.log(newsHeading.getElementsByTagName("li")[0].innerHTML);
}
showNewsHeading();

function changeHeadings(){
    var news = document.getElementById("news");
    news.innerHTML = "Wesołe Newsy";
    var sport = document.getElementById("sport");
    sport.innerHTML = "Anty Sport";
}
setTimeout(changeHeadings,3000);

function addNews() {
    var ul = document.getElementById("news-list");
    var input = document.getElementById("input-text");
    var newsText = input.value;
    var li = document.createElement("li");
    var liText = document.createTextNode(newsText);
    li.appendChild(liText);
    ul.appendChild(li);
    input.value = "";
}
function registerEvents() {
    var button = document.getElementById("add-button");
    button.addEventListener("click", function() {
        addNews();
    });
    button.addEventListener("click", function() {
        console.log("Button clicked")
    });
}
