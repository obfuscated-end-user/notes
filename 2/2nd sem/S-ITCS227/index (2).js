/*
Review:
	Mini-Activity: 15 mins
	*Name your variables appropriately. You may follow our guide in s14's notes.

	Create a let variable with the name of your favorite food.
	Create a let variable with the sum of 150 and 9.
	Create a let variable with the product of 100 and 90.
	Create a let variable with a boolean value.
		-this variable asks if the user is active.
	Create a group of data with the names of your 5 favorite restaurants.
	Create a variable which describes your favorite musical artist/singer or actor/actress with the following key-value pairs:
		firstName: <value>
		lastName: <value>
		stageName: <value>
		birthDay: <value>
		age: <value>
		bestAlbum: <value>/bestTVShow: <value>
		bestSong: <value>/bestMovie: <value>
		isActive: <value>

		if the data is unavailable or there is actually NO value, add null.
	
	Log all variables in the console.

	Create a function able to receive two numbers as arguments.
		display the quotient of the two numbers in the console.
		return the value of the division.

	Create a variable called quotient.
		-This variable should be able to receive the result of division function.

	Log the quotient variable's value in the console with the following message:

	"The result of the division is: <valueOfQuotient>"

		-use concatenation/template literal

	Take a screenshot of your code-based solution and your console and send it in to our Lecture SB Account.
*/

// Create a let variable with the name of your favorite food.
let favoriteFood = "Ice cream";
// Create a let variable with the sum of 150 and 9.
let sum = 150 + 9;
// Create a let variable with the product of 100 and 90.
let product = 100 * 90;
// Create a let variable with a boolean value.
let isUserActive = true;

// Create a group of data with the names of your 5 favorite restaurants.
let favoriteRestaurants = ["Shakey's", "McDonald's", "Pizza Hut", "Greenwich", "Yellow Cab"];

// Create a variable which describes your favorite musical artist/singer or actor/actress with the following key-value pairs:
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

// Create a function able to receive two numbers as arguments. display the quotient of the two numbers in the console. return the value of the division.
function divide(num1, num2) {
    quotient = num1 / num2;
    console.log("The quotient is: " + quotient);
    return quotient;
}

// Create a variable called quotient.
// -This variable should be able to receive the result of division function.
quotient = divide(20, 10);

console.log("The result of the division is: " + quotient);