#include <stdio.h>
main() {
    printf("REDACTED\nBCS11\n\n");
    int x, y;
    start(x, y);
}
start(int a, int b) {
    printf("Enter first integer: ");
    scanf("%d", &a);
    printf("Enter second integer: ");
    scanf("%d", &b);
    printf("\n======================\n");
    add(a, b);
    sub(a, b);
    mult(a, b);
    divide(a, b);
}
add(int a, int b) {
    int sum = a + b;
    printf("The sum of %d and %d is %d.\n", a, b, sum);
}
sub(int a, int b) {
    int diff = a - b;
    printf("The difference between %d and %d is %d.\n", a, b, diff);
}
mult(int a, int b) {
    int prod = a * b;
    printf("The product of %d and %d is %d.\n", a, b, prod);
}
divide(int a, int b) {
    int quot = a / b;
    printf("The quotient of %d and %d is %d.", a, b, quot);
}