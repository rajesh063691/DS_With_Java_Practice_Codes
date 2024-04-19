import java.util.Scanner;

public class BinarySearchTree {
    Node root;


    public BinarySearchTree() {
    }

    private class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public int getHeight(Node node) {
            if (node == null) {
                return -1;
            }
            return node.height;
        }
    }


    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    public void populate(Scanner sc) {
        System.out.println("enter the root node value :: ");
        int value = sc.nextInt();
        root = new Node(value);
        boolean insertMore = true;
        while (insertMore) {
            System.out.println("do you wan to insert more nodes :: ");
            insertMore = sc.nextBoolean();
            if (insertMore) {
                System.out.println("enter the node value :: ");
                int val = sc.nextInt();
                populateBST(val, root);
            }
        }
    }

    private void populateBST(int value, Node node) {
        // insertion of left and right nodes
        // left side insertion
        if (value < node.value) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                populateBST(value, node.left);
            }

        }

        // right side insertion
        if (value > node.value) {
            if (node.right == null) {
                node.right = new Node(value);
            } else {
                populateBST(value, node.right);
            }
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        System.out.print(node.value + " ");
        postOrder(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.populate(new Scanner(System.in));
        bst.display();
        // System.out.println(bst.getHeight());
    }
}
