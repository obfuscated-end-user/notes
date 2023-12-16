// if powerpoint presentation does not work:
// https://youtu.be/fKUrEdAcTeD

import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]) {
        // alternate between these
        // int array[] = {9, 14, 3, 2, 43, 11, 58, 22}; // [2, 3, 9, 11, 14, 22, 43, 58]
        int array[] = {11, 12, 13, 5, 6}; // [5, 6, 11, 12, 13]
        System.out.println("Unsorted array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(insertionSort(array)));
    }

    public static int[] insertionSort(int arr[]) {
        /*
         *  i = index of element at unsorted part (right)
         *  j = index of element at sorted part (left)
         *  k = current element
         */
        for (int i = 1; i < arr.length; i++) {
            // j = rightmost element's INDEX (not the element itself) - 1 (the left/sorted side)
            // this is 0 on the first pass
            int j = i - 1;
            // k = value at rightmost element (the right/unsorted side or the key)
            // this is arr[1] on the first pass, or 11
            int k = arr[i];
            // "while left side's index >= 0 AND value at left side > right element"
            // Checks if the value on the left side is larger than the right side. If it is, swap them.
            while (j >= 0 && arr[j] > k) {
                // Set left side's value to be equal to that of the right side.
                // This is the part where the swapping happens.
                arr[j + 1] = arr[j];
                // Decrement j to move back 1 step from the left side in order to
                // see if there are still any values not on order.
                // This is -1 on the first pass.
                j--;
            }
            // Set new value for the left side (the sorted part).
            // This is 11 on the first pass.
            arr[j + 1] = k;
        }
        // Return the sorted array.
        return arr;
    }
}