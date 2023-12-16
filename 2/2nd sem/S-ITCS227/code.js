let favoriteFood = "Ice cream";
let sum = 150 + 9;
let product = 100 * 90;
let isUserActive = true;
let favoriteRestaurants = ["Shakey's", "McDonald's", "Pizza Hut", "Greenwich", "Yellow Cab"];

let favoriteActor = {
    firstName: "Johnny",
    lastName: "Depp",
    stageName: null,
    birthday: "06/09/1963",
    age: 59,
    bestTVShow: "21 Jump Street",
    bestMovie: "Rango",
    isActive: true
};

console.log("Favorite food: " + favoriteFood);
console.log("Sum of 150 and 9: " + sum);
console.log("Product of 100 and 90: " + product);
console.log("Is the user active: " + isUserActive);
console.log("My favorite restaurants are:", favoriteRestaurants);
console.log("My favorite actor is:", favoriteActor);

function divide(num1, num2) {
    quotient = num1 / num2;
    console.log("The quotient is: " + quotient);
    return quotient;
}

quotient = divide(20, 10);

console.log("The result of the division is: " + quotient);