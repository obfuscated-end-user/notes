/*package perfectbinarytree;

 public class PerfectBinaryTree {
 public static void main(String[] args) {
 // balanced binary tree
 Tree tree = new Tree();

 tree.root = new Node(10);
 tree.root.left = new Node(30);
 tree.root.right = new Node(90);

 tree.root.left.left = new Node(50);
 tree.root.left.right = new Node(16);

 tree.root.right.left = new Node(67);
 tree.root.right.right = new Node(100);
        
 // bago
 tree.root.left.left.left = new Node(23);
 tree.root.left.left.right = new Node(10);
        
 tree.root.left.right.left = new Node(9);
 tree.root.left.right.right = new Node(29);
        
 tree.root.right.left.left = new Node(43);
 tree.root.right.left.right = new Node(55);
        
 tree.root.right.right.left = new Node(82);
 tree.root.right.right.right = new Node(77);

 System.out.println("In Order traversal");
 tree.inOrder(tree.root);
 }
 }

 class Node {
 int item;
 Node left, right;

 public Node(int key) {
 item = key;
 left = right = null;
 }
 }

 class Tree {
 Node root;

 Tree() {
 root = null;
 }

 void inOrder(Node node) {
 if (node == null)
 return;
 inOrder(node.left);
 System.out.print(node.item + " -> ");
 inOrder(node.right);
 }
 }*/

public class PerfectBinaryTree {

    static class Node {

        int key;
        Node left, right;
    }
// Calculate the depth

    static int depth(Node node) {
        int d = 0;
        while (node != null) {
            d++;
            node = node.left;
        }
        return d;
    }
// Check if the tree is perfect binary tree

    static boolean is_perfect(Node root, int d, int level) {
// Check if the tree is empty
        if (root == null) {
            return true;
        }
// If for children
        if (root.left == null && root.right == null) {
            return (d == level + 1);
        }
        if (root.left == null || root.right == null) {
            return false;
        }
        return is_perfect(root.left, d, level + 1) && is_perfect(root.right, d, level + 1);
    }
// Wrapper function

    static boolean is_Perfect(Node root) {
        int d = depth(root);
        return is_perfect(root, d, 0);
    }
// Create a new node

    static Node newNode(int k) {
        Node node = new Node();
        node.key = k;
        node.right = null;
        node.left = null;
        return node;
    }

     static void inOrder(Node node) {
        if (node == null)
        return;
        inOrder(node.left);
        System.out.print(node.key + " -> ");
        inOrder(node.right);
    }
    
    public static void main(String[] args) {
        Node root = null;
        root = newNode(10);
        root.left = newNode(30);
        root.right = newNode(90);
        root.left.left = newNode(50);
        root.left.right = newNode(16);
        root.right.left = newNode(67);
        root.right.right = newNode(100);
        // new
        root.left.left.left = newNode(23);
        root.left.left.right = newNode(10);
        
        root.left.right.left = newNode(9);
        root.left.right.right = newNode(29);
        
        root.right.left.left = newNode(43);
        root.right.left.right = newNode(55);
        
        root.right.right.left = newNode(82);
        root.right.right.right = newNode(77);
        
        System.out.println("In Order traversal");
        inOrder(root);
        if (is_Perfect(root) == true) {
            System.out.println("The tree is a perfect binary tree");
        } else {
            System.out.println("The tree is not a perfect binary tree");
        }
    }
}