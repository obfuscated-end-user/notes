#include<stdio.h>

int main() {
    printf("REDACTED\nBCS11\n");

    int hoursWorked, hourlyRate;
    float salary, bonus, totalSalary;

    printf("Enter hours worked: ");
    scanf("%d", &hoursWorked);
    printf("Enter rate: ");
    scanf("%d", &hourlyRate);

    salary = hoursWorked * hourlyRate;
    printf("Salary: %.2f\n", salary);

    if (hoursWorked > 50) {
        bonus = 5000;
        totalSalary = salary + bonus;
    } else if (hoursWorked > 40) {
        bonus = 3000;
        totalSalary = salary + bonus;
    } else if (hoursWorked > 30) {
        bonus = 1000;
        totalSalary = salary + bonus;
    } else {
        totalSalary = salary;
    }

    printf("Bonus: %.2f\n", bonus);
    printf("Total salary: %.2f", totalSalary);
}