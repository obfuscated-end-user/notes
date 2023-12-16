import java.util.Scanner;
public class REDACTED_ProgrammingAssessment1
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        final int SECRET = 11;
        final double RATE = 12.50;
        int num1, num2, newNum;
        String name;
        double hoursWorked, wages;
        System.out.print("Input two integers: ");
        num1 = console.nextInt();
        num2 = console.nextInt();
        System.out.println("The value of num1 = " + num1 + " and the value of num2 = "+ num2);
        newNum = num1 * 2 + num2;
        System.out.println("The value of newNum = " + newNum);
        newNum += SECRET;
        System.out.println("The new value of newNum = " + newNum);
        System.out.print("Enter your last name: ");
        console.nextLine();
        name = console.nextLine();
        System.out.print("Enter a decimal number between 0 and 70: ");
        hoursWorked = console.nextDouble();
        wages = RATE * hoursWorked;
        System.out.println("Name: " + name);
        System.out.println("Pay Rate: $" + RATE);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: $" + wages);
    }
}