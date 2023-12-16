import java.util.Stack;
import java.util.Scanner;

public class MSA1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        String cont = "y";

        System.out.print("Enter the maximum size of the stack: ");
        int maxStackSize = s.nextInt();

        while (cont.equals("y")) {
            System.out.println("Please press any number from the following stack operations:");
            System.out.println("1. Insert an element 2. Pop an element 3. Peek of the stack 4. Display the elements of the stack");
            int choice = s.nextInt();

            // push
            if (choice == 1) {
                System.out.print("Please enter the elements to insert: ");
                for (int i = 0; i < maxStackSize; ++i)
                    stack.push(s.nextInt());
            // pop
            } else if (choice == 2) {
                if (stack.empty())
                    System.out.println("Stack is empty");
                else {
                    stack.pop();
                    maxStackSize -= 1;
                    System.out.println("Element popped from the list");
                }
            // peek stack
            } else if (choice == 3) {
                if (stack.empty())
                    System.out.println("Stack is empty");
                else
                    System.out.println("Topmost element in Stack is: " + stack.peek());
            // show elements in the stack
            } else if (choice == 4) {
                if (stack.empty())
                    System.out.println("Stack is empty");
                else {
                    System.out.println("Elements in the stack are: ");
                    for (int index = maxStackSize; index >= 0; --index) {
                        if (index <= 0)
                            break;
                        else
                            System.out.print(stack.get(index - 1) + " ");
                    }
                    System.out.println();
                }
            } else
                break;
            System.out.println("Want to continue? y or n:");
            cont = s.next();
        }
        s.close();
    }
}