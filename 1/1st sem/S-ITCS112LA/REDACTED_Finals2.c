#include <stdio.h>

int main() {
    printf("REDACTED\nBCS11\n\n");
    
    int n, counter, temp = 0, sum = 0;
    float average = 0;

    printf("How many? ");
    scanf("%d", &n);
    printf("===============\n");
    
    for (counter = 1; counter <= n; counter +=1 ) {
        printf("Number %d: ", counter);
        scanf("%d", &temp);
        sum += temp;
    }

    printf("===============\n");
    average = sum / n;
    printf("Average = %.2f", average);
}