/*package balancedtree;

 public class BalancedTree {
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
 tree.root.left.left.left = new Node(55);
 tree.root.left.left.right = new Node(2);
        
 tree.root.left.right.left = new Node(6);
 tree.root.left.right.right = new Node(12);
        

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

public class BalancedTree {

    public static void main(String[] args) {
        Height height = new Height();
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        tree.root = new Node(10);
        tree.root.left = new Node(30);
        tree.root.right = new Node(90);
        tree.root.left.left = new Node(50);
        tree.root.left.right = new Node(16);
        tree.root.right.left = new Node(67);
        tree.root.right.right = new Node(100);
        // new
        tree.root.left.left.left = new Node(23);
        tree.root.left.left.right = new Node(10);
        
        tree.root.left.right.left = new Node(9);
        tree.root.left.right.right = new Node(29);
        
        tree.root.right.left.left = new Node(43);
        tree.root.right.left.right = new Node(55);
        
        tree.root.right.right.left = new Node(82);
        tree.root.right.right.right = new Node(77);
        if (tree.checkHeightBalance(tree.root, height)) {
            System.out.println("The tree is balanced");
        } else {
            System.out.println("The tree is not balanced");
        }
        BinaryTree.inOrder(tree.root);
    }
}
// Checking if a binary tree is height balanced in Java
// Node creation

class Node {

    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
// Calculate height

class Height {

    int height = 0;
}

class BinaryTree {

    Node root;
// Check height balance

    boolean checkHeightBalance(Node root, Height height) {
// Check for emptiness
        if (root == null) {
            height.height = 0;
            return true;
        }
        Height leftHeighteight = new Height(), rightHeighteight = new Height();
        boolean l = checkHeightBalance(root.left, leftHeighteight);
        boolean r = checkHeightBalance(root.right, rightHeighteight);
        int leftHeight = leftHeighteight.height, rightHeight = rightHeighteight.height;
        height.height = (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
        if ((leftHeight - rightHeight >= 2) || (rightHeight - leftHeight >= 2)) {
            return false;
        } else {
            return l && r;
        }
    }
    static void inOrder(Node node) {
        if (node == null)
        return;
        inOrder(node.left);
        System.out.print(node.data + " -> ");
        inOrder(node.right);
    }
}
