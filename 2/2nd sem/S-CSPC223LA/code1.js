let ratePerDay = prompt("Enter rate per day: ");
let daysWorked = prompt("Enter days worked: ");

let grossPay = ratePerDay * daysWorked;
console.log("Gross Pay is:", grossPay.toFixed(2))

let pagIbig = grossPay * 0.1;
console.log("Pag-ibig contribution:", pagIbig.toFixed(2));

let gsis = grossPay * 0.12;
console.log("GSIS contribution:", gsis.toFixed(2));

let philHealth = grossPay * 0.15;
console.log("Philhealth contribution:", philHealth.toFixed(2));

let netPay = grossPay - (pagIbig + gsis + philHealth);
console.log("Net Pay is:", netPay.toFixed(2));