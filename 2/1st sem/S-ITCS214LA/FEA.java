import java.util.Arrays;
import java.util.Scanner;

public class FEA {
	public static void odd(int array[], int index) {
        if (index > array.length - 1)
            return;
        if (array[index] % 2 != 0)
            System.out.println(array[index]);
        odd(array, index + 1);
    }

    public static void even(int array[], int index) {
        if (index > array.length - 1)
            return;
        if (array[index] % 2 == 0)
            System.out.println(array[index]);
        even(array, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];

        System.out.println("Enter array elements:");
        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();
        sc.close();

        System.out.println("\nElements: " + Arrays.toString(array).replaceAll("\\[", "").replaceAll("\\]",""));

        System.out.println("\nOdd numbers:");
        odd(array, 0);
        System.out.println("\nEven numbers:");
        even(array, 0);
    }
}