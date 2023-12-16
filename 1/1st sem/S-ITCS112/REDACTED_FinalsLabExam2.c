#include <stdio.h>

int main() {
    printf("REDACTED\nBCS11\n\n");
    
    int row, column, n;
    printf("How many? ");
    scanf("%d", &n);

    row = n;

    do {
        column = row;
        do {
            printf("%d", column);
            column--;
        } while (column >= 1);
        printf("\n");
        row--;
    } while (row >= 1);
}