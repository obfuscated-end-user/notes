#include <stdio.h>
int a[5]= {5, 10, 15, 20, 25};
int x, temp, size =5;
main()
{
	printf("BEFORE:\n\n");
	while (x <= 4) {
	    printf("Element [%d] is %d\n", x, a[x]);
	    x++;
	}
	loop1();
	printf("\n======================\nAFTER:\n\n");
	loop2();
}

loop1() {
	x = 0;
	while (x <= 2) {
	    temp = a[x]; // 0 1
		a[x] = a[(size - 1) - x]; // 25 20
		a[(size - 1) - x] = temp;
		x++;
	}
}

loop2() {
	x = 0;
	while (x <= 4) {
	    printf("Element [%d] is %d\n", x, a[x]);
	    x++;
	}
}