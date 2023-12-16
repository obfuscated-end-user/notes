#include <stdio.h>

int main() {
    printf("REDACTED\nBCS11\n\n");
    
    int counter = 1, factorial = 1, n;

    printf("How many? ");    
    scanf("%d", &n);
    printf("===============\n");

    while (counter <= n) {
        factorial *= counter;
        counter++;
    }

    printf("The product of numbers from 1 to %d is %d.", n, factorial);
}