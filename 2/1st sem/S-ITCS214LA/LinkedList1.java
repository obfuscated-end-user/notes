package linkedlist1;

public class LinkedList1 {

    // Create a node
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node head = null;
    Node tail = null;
    
    //addNode() will add a new node to the list
    void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(int new_data) {
        // insert the data
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Insert after a node
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
        return;
    }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    // Insert at the end
    public void insertAtEnd(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }

    // Delete a node
    void deleteNode(int position) {
        if (head == null)
            return;

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }
        // Find the key to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If the key is not present
        if (temp == null || temp.next == null)
            return;

        // Remove the node
        Node next = temp.next.next;

        temp.next = next;
    }
    
    // Implement a method that remove a node with the given data from the link list.
    void remove(int data) {
        Node temp = head, prev = null;
        
        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }
        
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        
        if (temp == null) {
            return;
        }
        
        prev.next = temp.next;
        // System.out.println(data + " has been removed from the list");
    }

    // Search a node
    boolean search(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }

    // Sort the linked list
    void sortLinkedList(Node head) {
        Node current = head;
        Node index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                // index points to the node next to current
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    
    // Implement a method that will inserts a new node with the given data at the front of the linked list
    void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    // Count the total number of nodes in the list
    int countNodes() {
        int count = 0;    
        Node current = head; 
            
        while(current != null) {      
            count++;    
            current = current.next;    
        }    
        return count;
    }

    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
    }

    // main class
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        
        list.addNode(2);
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        list.addNode(4);
        
        System.out.println("Linked list: ");
        list.printList();
        System.out.println();
        
        System.out.println("Insert in front of linked list: ");
        list.insertFront(6);
        list.printList();
        System.out.println();
        
        System.out.println("Remove a node by data:");
        System.out.println("After removing 1:");
        list.remove(1);
        list.printList();
        System.out.println();
        
        System.out.println("Counting the total number of nodes:");
        System.out.println("Total number of nodes in the list: " + list.countNodes());
        System.out.println();
        
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        System.out.println("Using different insert methods:");
        
        list.remove(2);
        list.remove(5);
        list.remove(3);
        list.remove(4);
        list.remove(6);
        
        list.insertAtBeginning(13);
        list.insertAtBeginning(8);
        list.insertAtBeginning(5);
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.insertAtBeginning(1);
        list.insertAtEnd(21);
        list.insertAtEnd(34);
        list.insertAtEnd(55);
        list.insertAtEnd(89);
        list.insertAtEnd(144);
        
        list.printList();
    }
}
