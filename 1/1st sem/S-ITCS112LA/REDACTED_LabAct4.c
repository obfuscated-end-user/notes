#include <stdio.h>

int main() {
    printf("REDACTED\nBCS11\n");
    printf("-------------------\n");
    // decalre quiz score and average variables
    int num1, num2, sum, diff, prod, quot;
    // get input from user
    printf("Enter number 1: ");
    scanf("%d", &num1);
    printf("\nEnter number 2: ");
    scanf("%d", &num2);
    sum = num1 + num2;
    diff = num1 - num2;
    prod = num1 * num2;
    quot = num1 / num2;
    printf("=================\n");
    printf("Sum = %d\n", sum);
    printf("Difference = %d\n", diff);
    printf("Product = %d\n", prod);
    printf("Quotient = %d", quot);
}