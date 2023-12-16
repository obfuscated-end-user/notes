package com.mycompany.seconddiagonal;

import java.util.Scanner;

public class SecondDiagonal {
    public static void main(String[] args) {       
        System.out.println("2nd diagonal");
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter an integer for the size of the array: ");

        while (true) {
            try {
                size = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Enter a valid input value: ");
                sc.nextLine();
                continue;
            }
        }
        
        if (size < 1) {
            size = 0;
        }
        int[][] diagonalArray = new int[size][size];
        
        for (int i = 0; i < diagonalArray.length; i++) {
            System.out.println("Row " + Integer.toString(i + 1) + ": ");
            for (int j = 0; j < diagonalArray[i].length; j++) {
                System.out.print("Enter a number: ");
                int temp = 0;
                while (true) {
                    try {
                        temp = sc.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.print("Enter a valid input value: ");
                        sc.nextLine();
                        continue;
                    }
                }
                diagonalArray[i][j] = temp;
            }
        }
        
        System.out.println("\nYour array: ");
        if (size == 0) {
            System.out.println("(none)");
        } else {
            for (int i = 0; i < diagonalArray.length; i++) {
                System.out.print( "| ");
                for (int j = 0; j < diagonalArray[i].length; j++) {
                    System.out.print(diagonalArray[i][j] + " | ");
                }
                System.out.println();
            }
        }

        System.out.print("\nSum: ");
        int sum = 0;
        for (int i = 0, j = diagonalArray.length - 1; j > -1; i++, j--) {
            sum += diagonalArray[i][j];
            if (i == diagonalArray.length - 1) {
                System.out.print(diagonalArray[i][j]);
            } else {
                System.out.print(diagonalArray[i][j] + " + ");
            }
        }
        System.out.println(" = " + sum);
    }
}