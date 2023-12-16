// singil
var minFare = 12;
var add = 1; // extra km(s) sa biyahe pag sumobra sa 5km

// discounts
var pwdDiscount = 0.35;
var seniorDiscount = 0.3;
var studentDiscount = 0.25;
var regularDiscount = 0;

console.log("Minimum fare:", minFare);
console.log("PWD, 35% discount, 6km:", minFare - (minFare * pwdDiscount).toFixed(2) + add);
console.log("Senior, 30% discount, 6km:", minFare - (minFare * seniorDiscount) + add);
console.log("Student, 25% discount, 6km:", minFare - (minFare * studentDiscount) + add);
console.log("Regular, no discount, 6km:", minFare - (minFare * regularDiscount) + add);