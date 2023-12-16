#include <stdio.h>

int main() {
    printf("REDACTED\nBCS11\n");
    printf("-------------------\n");
    // decalre quiz score and average variables
    float quiz1, quiz2, quiz3;
    float average;
    // get input from user
    printf("Quiz 1: ");
    scanf("%f", &quiz1);
    printf("\nQuiz 2: ");
    scanf("%f", &quiz2);
    printf("\nQuiz 3: ");
    scanf("%f", &quiz3);
    average = (quiz1 + quiz2 + quiz3) / 3;
    printf("=================\n");
    printf("Average = %.2f", average);
}