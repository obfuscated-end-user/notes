/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack2;

import java.util.Stack;

/*
    Activity 2

    Push the following name of student into the stack: Ivan, Ralp, Angelo, Sophia, Christine, Francis, Jose, Klive
    Display the last element
    Display the top element
    Pop twice
    Display the new list
    Remove the top element
    Display the new list
    Display the size of the stack
    Display the position of Angelo
    Display the position  of Sophia
    Clear the list
    Check if it is empty
    Push the following Cyrus, Vea, Gerson, Sean, Joe
    Display the new list
    Check if it is empty
*/
public class Stack2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        // Push the following name of student into the stack: Ivan, Ralp,
        // Angelo, Sophia, Christine, Francis, Jose, Klive
        stack.push("Ivan");
        stack.push("Ralp");
        stack.push("Angelo");
        stack.push("Sophia");
        stack.push("Christine");
        stack.push("Francis");
        stack.push("Jose");
        stack.push("Klive");
        
        System.out.println("\nPrint the stack:\n" + stack);
        
        // Display the last element
        System.out.println("\nThe last element of the stack:\n" + stack.peek());
        
        // Display the top element
        System.out.println("\nThe top element of the stack:\n" + stack.peek());
        // last element and top element of the stack are the same thing
        
        // Pop twice
        stack.pop();
        stack.pop();
        
        // Display the new list
        System.out.println("\nNew list:\n" + stack);
        
        // Remove the top element
        stack.pop();    // top element is the same as the last
        
        // Display the new list
        System.out.println("\nAfter popping:\n" + stack);
        
        // Display the size of the stack
        System.out.println("\nSize of the stack: " + stack.size());
        
        // Display the position of Angelo
        System.out.println("\nPosition of Angelo in the stack: "
                            + stack.search("Angelo"));
        
        // Display the position of Sophia
        System.out.println("\nPosition of Sophia in the stack: "
                            + stack.search("Sophia"));
        
        // Clear the list
        System.out.println("\nClearing the stack...");
        stack.clear();
        
        // Check if it is empty
        System.out.println("\nCheck if stack is empty: " + stack.empty());
        
        // Push the following Cyrus, Vea, Gerson, Sean, Joe
        System.out.println("\nPushing new elements...");
        stack.push("Cyrus");
        stack.push("Vea");
        stack.push("Gerson");
        stack.push("Sean");
        stack.push("Joe");
        
        // Display the new list
        System.out.println("\nNew list:\n" + stack);
        
        // Check if it is empty
        System.out.println("\nCheck if stack is empty: " + stack.empty());
    }
}