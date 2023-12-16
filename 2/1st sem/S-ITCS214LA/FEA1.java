class FEA1 {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // root
        tree.root = new Node(50);

        // left
        tree.root.left = new Node(40);
        tree.root.left.left = new Node(37);
        tree.root.left.left.left = new Node(25);
        tree.root.left.left.left.right = new Node(33);
        tree.root.left.right = new Node(45);
        tree.root.left.right.right = new Node(49);

        // right
        tree.root.right = new Node(60);
        tree.root.right.left = new Node(55);
        tree.root.right.left.left = new Node(54);
        tree.root.right.left.right = new Node(58);
        tree.root.right.right = new Node(70);
        tree.root.right.right.left = new Node(67);

        System.out.println("\nIn-order traversal");
        tree.inOrder(tree.root);
        System.out.println("\nPre-order traversal");
        tree.preOrder(tree.root);
        System.out.println("\nPost-order traversal");
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

    void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.item + " ");
        inOrder(node.right);
    }

    void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.item + " ");
    }

    void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.item + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}