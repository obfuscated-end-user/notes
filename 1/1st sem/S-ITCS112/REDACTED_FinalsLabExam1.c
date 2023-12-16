#include <stdio.h>

int main() {
    printf("REDACTED\nBCS11\n\n");
    
    int row, column, n;

    printf("How many? ");
    scanf("%d", &n);
    
    for (row = n; row >= 1; row--) {
        for (column = 1; column <= row; column++) {
            printf("%d", column);
        }
        printf("\n");
    }
}