
package full;


public class Full {
    

  
    public static void main(String[] args) {
        
        Tree tree = new Tree();

        tree.root = new Node(54);
        tree.root.left = new Node(2);
        tree.root.right = new Node(86);

        tree.root.left.left = new Node(23);
        tree.root.left.right = new Node(12);

        tree.root.right.left = new Node(53);
        tree.root.right.right = new Node(28);
        
        tree.root.left.left.left = new Node(22);
        tree.root.left.left.right = new Node(7);

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
    
    

