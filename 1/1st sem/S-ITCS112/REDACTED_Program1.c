#include <stdio.h>

int main() {
    printf("REDACTED\nBCS11\n\n");
    
    int n, counter, even, odd;
    int evenSum = 0, oddSum = 0;

    printf("How many? ");
    scanf("%d", &n);
    printf("\n===============\n");
    
    printf("Even numbers from 1 to %d are: ", n);
    for (counter=2; counter<=n; counter+=2) {
        printf("%d ", counter);
        evenSum += counter;
    }
    
    printf("\nOdd numbers from 1 to %d are: ", n);
    for (counter=1; counter<=n; counter+=2) {
        printf("%d ", counter);
        oddSum += counter;
    }

    printf("\nSum of Even = %d", evenSum);
    printf("\nSum of odd = %d", oddSum);
}