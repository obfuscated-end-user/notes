// 1:39:00

console.log("hello");

document.getElementById("btn-1").addEventListener(
    "click", () => {
        alert("Add More!");
    }
);

let paragraph1 = document.getElementById("paragraph-1");
let paragraph2 = document.getElementById("paragraph-2");

document.getElementById("btn-2").addEventListener(
    "click", () => {
        paragraph1.innerHTML = "I can even do this!";
    }
);

document.getElementById("btn-3").addEventListener(
    "click", () => {
        paragraph2.innerHTML = "Or this!";
        paragraph2.style.color = "red";
        paragraph2.style.fontSize = "50px";
    }
);