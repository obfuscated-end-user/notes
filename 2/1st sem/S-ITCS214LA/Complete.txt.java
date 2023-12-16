
package complete;

public class Complete {

   
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = new Node(54);
        tree.root.left = new Node(2);
        tree.root.right = new Node(86);

        tree.root.left.left = new Node(23);
        tree.root.left.right = new Node(12);

        tree.root.right.left = new Node(53);
        tree.root.right.right = new Node(28);
        
        tree.root.left.left.left = new Node(34);
        
        BinaryTree tree2 = new BinaryTree();

        
        int node_count = tree2.countNumNodes(tree2.root);
        int index = 0;
        if (tree2.checkComplete(tree2.root, index, node_count))
        System.out.println("The tree is a complete binary tree\n");
        else
        System.out.println("The tree is not a complete binary tree\n");
        

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
            System.out.print(node.item + "->");
            inOrder(node.right);
    }
    
}
        class Node2 {
int data;
Node2 left, right;
Node2(int item) {
data = item;
left = right = null;
}
}
class BinaryTree {
Node2 root;
// Count the number of nodes
int countNumNodes(Node2 root) {
if (root == null)
return (0);
return (1 + countNumNodes(root.left) + countNumNodes(root.right));
}
// Check for complete binary tree
boolean checkComplete(Node2 root, int index, int numberNodes) {
// Check if the tree is empty
if (root == null)
return true;
if (index >= numberNodes)
return false;
return (checkComplete(root.left, 2 * index + 1, numberNodes)
&& checkComplete(root.right, 2 * index + 2, numberNodes));
}}
