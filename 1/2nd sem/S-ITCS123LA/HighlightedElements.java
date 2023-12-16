package com.mycompany.highlightedelements;

import java.util.Scanner;

public class HighlightedElements {

    public static void main(String[] args) {
        System.out.println("Highlighted Elements");
        System.out.print("Enter an integer for the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = 0;

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
        int[][] highlightedArray = new int[size][size];

        for (int i = 0; i < highlightedArray.length; i++) {
            System.out.println("Row " + Integer.toString(i + 1) + ": ");
            for (int j = 0; j < highlightedArray[i].length; j++) {
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
                highlightedArray[i][j] = temp;
            }
        }
        
        System.out.println("\nYour array: ");
        if (size == 0) {
            System.out.println("(none)");
        } else {
            for (int i = 0; i < highlightedArray.length; i++) {
                System.out.print( "| ");
                for (int j = 0; j < highlightedArray[i].length; j++) {
                    System.out.print(highlightedArray[i][j] + " | ");
                }
                System.out.println();
            }
        }

        System.out.print("\nSum: ");
        int sum = 0;
        for (int i = 0; i < highlightedArray.length; i++) {
            for (int j = 0, k = highlightedArray.length - 1;
                 j < highlightedArray.length; j++, k--) {
                if ((i == j) || (i == k)); 
                else {
                    sum+=highlightedArray[i][j];
                    if ((i == highlightedArray.length - 1) &&
                        (j == highlightedArray.length - 2)) {
                        System.out.print(highlightedArray[i][j]);
                    } else {
                        System.out.print(highlightedArray[i][j] + " + ");
                    }
                }
            }
        }
        if (sum == 0) {
            System.out.println(sum);
        } else {
            System.out.println(" = " + sum);
        }
    }
}