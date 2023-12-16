class Node {
    int item;
    Node left;
    Node right;

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
    static int depth(Node node) {
        int depth = 0;
        while (node != null) {
            depth++;
            node = node.left;
        }
        return depth;
    }

    static boolean isPerfectTree(Node root, int depth, int level) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return (depth == level + 1);
        if (root.left == null || root.right == null)
            return false;
        return isPerfectTree(root.left, depth, level + 1) && isPerfectTree(root.right, depth, level + 1);
    }
    static boolean isPerfect(Node root) {
        int depth = depth(root);
        return isPerfectTree(root, depth, 0);
    }
}

class FEA2 {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // root
        tree.root = new Node(100);

        // left
        tree.root.left = new Node(99);
        tree.root.left.left = new Node(30);
        tree.root.left.left.left = new Node(9);
        tree.root.left.left.right = new Node(21);
        tree.root.left.right = new Node(98);
        tree.root.left.right.left = new Node(27);
        tree.root.left.right.right = new Node(22);

        // right
        tree.root.right = new Node(101);
        tree.root.right.left = new Node(102);
        tree.root.right.left.left = new Node(65);
        tree.root.right.left.right = new Node(55);
        tree.root.right.right = new Node(105);
        tree.root.right.right.left = new Node(104);
        tree.root.right.right.right = new Node(103);

        System.out.println("\n\nOriginal post-order traversal:");
        tree.postOrder(tree.root);
        System.out.println("\n\nIn-order traversal:");
        tree.inOrder(tree.root);

        // determine the type of this tree
        if (Tree.isPerfect(tree.root))
            System.out.println("\n\nThe tree is a perfect binary tree");
        else
            System.out.println("\n\nThe tree is not a perfect binary tree");
    }
}