public class FSA2 {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // root
        tree.root = new Node(20);

        // left
        tree.root.left = new Node(10);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(15);
        tree.root.left.right.left = new Node(13);

        // right
        tree.root.right = new Node(35);
        tree.root.right.left = new Node(30);
        tree.root.right.right = new Node(42);

        System.out.println("Pre-Order traversal");
        tree.preOrder(tree.root);

        System.out.println("\nIn-Order traversal");
        tree.inOrder(tree.root);

        System.out.println("\nPost-Order traversal");
        tree.postOrder(tree.root);
    }
}

class Node {
    int item;
    Node left, right;

    public Node(int key) {
        item = key;
        left = null;
        right = null;
    }
}

class Tree {
    Node root;

    Tree() {
        root = null;
    }

    // root left right
    void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.item + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // left root right
    void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.item + " ");
        inOrder(node.right);
    }

    // left right root
    void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.item + " ");
    }
}