import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class MEA3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List <Integer> list = new ArrayList <Integer>();
        System.out.println("Enter how many elements to be inputted");
        int numberOfElements = input.nextInt();

        System.out.println("Input the elements");
        for (int i = 0; i < numberOfElements; ++i)
            list.add(input.nextInt());
        input.close();
        
        System.out.println("The elements of the list are: " + list);
        Collections.sort(list);
        System.out.println("The sorted list are: " + list);
        list.remove(4);
        System.out.println("After removing the content of index 4: " + list);
        list.set(3, 10);
        System.out.println("Changing the content of index 3 to 10: " + list);
        System.out.println("The size of the list: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));
        list.clear();
        System.out.println("After using the clear method: " + list);
    }
}
