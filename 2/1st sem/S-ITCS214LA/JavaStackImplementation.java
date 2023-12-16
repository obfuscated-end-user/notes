import java.util.Stack;

public class JavaStackImplementation {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // Push the elements y, p, P, a, h
        stack.push("y");
        stack.push("p");
        stack.push("P");
        stack.push("a");
        stack.push("h");
        System.out.println("Stack: " + stack);

        // Reverse the pushed elements to h, a, P, p, y
        stack.clear();
        stack.push("h");
        stack.push("a");
        stack.push("P");
        stack.push("p");
        stack.push("y");
        System.out.println("Reversed stack: " + stack);

        // Display the length of the stack
        System.out.println("Size of the stack: " + stack.size());

        // Display first element of the stack
        System.out.println("First element of the stack: " + stack.firstElement());

        // Display the top element of the stack
        System.out.println("Top element: " + stack.peek());
        
        // Display the 3rd element of the stack
        System.out.println("3rd element of the stack: " + stack.get(2));

        // Perform first pop
        System.out.println("1st pop: " + stack.pop());

        // Perform second pop
        System.out.println("2nd pop: " + stack.pop());

        // Display the contents of the stack
        System.out.println("Stack: " + stack);

        // Replace the 3rd element of the stack with a lower case p
        stack.set(2, "p");

        // Search for the position of upper-case P
        System.out.println("Position of \"P\": " + stack.search("P"));

        // Search for the position of lower-case p
        System.out.println("Position of \"p\": " + stack.search("p"));

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());

        // Remove all the contents of the stack
        stack.clear();
        System.out.println("Stack cleared!");

        // Display the content of the stack
        System.out.println("Stack: " + stack);
    }
}