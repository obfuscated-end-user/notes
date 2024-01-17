#include <stdio.h>
int a[5] ={5, 10, 15, 20, 25};
int x, temp, size=5;
main()
{
	printf("BEFORE:\n\n");
	for (x=0; x<=4; x++)
	{
		printf("Element [%d] is %d\n", x, a[x]);
	}
	loop1();
	printf("\n======================\nAFTER:\n\n");
	loop2();
}
loop1()
{
	for (x=0; x<=2; x++)
	{
		temp = a[x];
		a[x] = a[(size-1)-x];
		a[(size-1)-x] = temp; 
	}
}
loop2() 
{
	for (x = 0; x <= 4; x++)
	{
		printf("Element [%d] is %d\n", x, a[x]);
	}
}


// **** you

#include <stdio.h>
int a[5] ={5, 10, 15, 20, 25};
int x, temp, size=5;
// remove the comments obviously
main()
{
	printf("BEFORE:\n\n");
	// print all the values in array a
	for (x = 0; x <= 4; x++) {
		printf("Element [%d] is %d\n", x, a[x]);
	}
	// call loop1() (reverse the order of the array)
	loop1();
	printf("\n======================\nAFTER:\n\n");
	// call loop2() (print out the array again to display the difference between the two)
	loop2();
}

// this reverses the array, does not print anything
loop1() {
	for (x = 0; x <= 2; x++) {
		temp = a[x]; // use temporary value for some random use
		a[x] = a[(size - 1) - x]; // current a[x] value will be 1 object ahead WHAT
		a[(size - 1) -x] = temp;  // **** you
	}
}

// same as the first loop above, prints all the values in the array
loop2() {
	for (x = 0; x <= 4; x++) {
		printf("Element [%d] is %d\n", x, a[x]);
	}
}