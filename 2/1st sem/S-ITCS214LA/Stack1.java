package stack1;

import java.util.Stack;
 
/*
    Activity 1

    Instruction: Apply the five (5) stack method in a program, output your
    preferred list you want to display. Submit the program file and the output's
    screenshot.
*/
public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // push()
        stack.push(10);
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Print the stack:\n" + stack);
        
        // pop()
        System.out.println("\npop()\nElement popped: " + stack.pop());
        System.out.println("After popping:\n" +stack);
        
        // peek()
        System.out.println("\npeek()\nElement at the top of the stack: "
                            + stack.peek());
        
        // empty()
        System.out.println("\nempty()\nCheck if stack is empty: "
                            + stack.empty());
        
        // search()
        System.out.println("\nsearch()\nSearch for an element in the stack:");
        System.out.println("Position of 10: " + stack.search(10)); // 9
        System.out.println("Search for an element not in the stack:");
        System.out.println("Position of 90: " + stack.search(90)); // -1
    }
}