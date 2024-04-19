
public class AVLTree {

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

    public AVLTree() {
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


    // this needs to be  changed a little bit
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
        return rotate(node);
    }

    private Node rotate(Node node) {
        // left heavy case
        if (getHeight(node.left) - getHeight(node.right) > 1) {

            if (getHeight(node.left.left) - getHeight(node.left.right) > 0) {
                // left left case - so right rotate on node
                return rightRotate(node);
            }

            if (getHeight(node.left.left) - getHeight(node.left.right) < 0) {
                // left right case - so left rotate on node.left and right rotate on node
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // right heavy case
        if (getHeight(node.left) - getHeight(node.right) < -1) {

            if (getHeight(node.right.left) - getHeight(node.right.right) < 0) {
                // right right case - so left rotate on node
                return leftRotate(node);
            }

            if (getHeight(node.right.left) - getHeight(node.right.right) > 0) {
                // right left case - so left rotate on node.left and right rotate on node
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        // // left rotate
        p.left = c;
        c.right = t;

        // adjust the height of both p and c
        c.height = Math.max(getHeight(c.left), getHeight(c.right) + 1);
        p.height = Math.max(getHeight(p.left), getHeight(p.right) + 1);

        return p;

    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        // right rotate
        c.right = p;
        p.left = t;

        // adjust the height of both p and c
        c.height = Math.max(getHeight(c.left), getHeight(c.right) + 1);
        p.height = Math.max(getHeight(p.left), getHeight(p.right) + 1);

        return c;
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

}
