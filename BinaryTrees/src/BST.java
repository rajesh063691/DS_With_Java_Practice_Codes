import java.util.Arrays;

public class BST {

    public class Node {
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

    }

    private Node root;


    public BST() {
    }

    public int getHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
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

    public void populate(int value) {
        root = insertInBST(root, value);
    }

    private Node insertInBST(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insertInBST(node.left, value);
        }
        if (value > node.value) {
            node.right = insertInBST(node.right, value);
        }

        // here, we are traversing back - so update height of each node by 1
        node.height = Math.max(Math.abs(getHeight(node.left)), Math.abs(getHeight(node.left))) + 1;
        return node;
    }

    public boolean isBalanced() {
        return balance(root);
    }

    private boolean balance(Node node) {
        if (node == null) {
            return true;
        }
        // check for each node's left and right height difference to find if tree is balanced
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balance(node.left) && balance(node.right);
    }

    // this is only for sorted elements
    public void insertSortedArrays(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        populate(arr[mid]);
        // insert left side of array and right side of array
        insertSortedArrays(arr, start, mid);
        insertSortedArrays(arr, mid + 1, end);
    }


    public static void main(String[] args) {
        //int[] arr = {15, 10, 12, 20, 18, 25, 19, 21};
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BST bst = new BST();
        System.out.println("is Tree Empty :: " + bst.isEmpty());
//        for (int val : arr) {
//            bst.populate(val);
//        }
        bst.insertSortedArrays(arr, 0, arr.length);
        bst.display();
        System.out.println("is Tree Balanced :: " + bst.isBalanced());
        System.out.println("is Tree Empty :: " + bst.isEmpty());
    }

}
