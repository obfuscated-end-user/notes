#include <stdio.h>

int main() {
    printf("REDACTED\nBCS11\n\n");

    int n, even, odd;
    int counter = 2, evenSum = 0, oddSum = 0;

    printf("How many? ");
    scanf("%d", &n);
    printf("\n===============\n");
    
    printf("Even numbers from 1 to %d are: ", n);
    while (counter <= n) {
        printf("%d ", counter);
        evenSum += counter;
        counter += 2;
    }
    
    counter = 1;

    printf("\nOdd numbers from 1 to %d are: ", n);
    while (counter <= n) {
        printf("%d ", counter);
        oddSum += counter;
        counter += 2;
    }

    printf("\nSum of Even = %d", evenSum);
    printf("\nSum of odd = %d", oddSum);
}