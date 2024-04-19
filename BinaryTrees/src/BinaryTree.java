import tree.questions.BFSTreeQuestions;

import java.util.*;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void populate(Scanner scanner) {
        System.out.println("Enter the root node value: ");
        int val = scanner.nextInt();
        root = new Node(val);
        // call the helper function
        populateTree(scanner, root);
    }

    private void populateTree(Scanner scanner, Node node) {
        System.out.println("do you want to insert the left of : " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of : " + node.value);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populateTree(scanner, node.left);
        }
        System.out.println("do you want to insert the right of : " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of : " + node.value);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populateTree(scanner, node.right);
        }
    }

    public void display() {
        displayTree(root, "");
    }

    private void displayTree(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        displayTree(node.left, indent + "\t");
        displayTree(node.right, indent + "\t");
    }

    public void displayPretty() {
        displayPretty(root, 0);
    }

    private void displayPretty(Node node, int level) {
        if (node == null) {
            return;
        }
        displayPretty(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);

        } else {
            System.out.println(node.value);
        }
        displayPretty(node.left, level + 1);

    }

    public List<List<Integer>> printInBFS() {
        return printInBFS(root);
    }

    private List<List<Integer>> printInBFS(Node node) {
        List<List<Integer>> parent = new ArrayList<>();
        List<Integer> child = new ArrayList<>();
        if (node == null) {
            parent.add(child);
            return parent;
        }

        // inserts root node value to child list
        child.add(node.value);
        // create queue to store the level wise nodes value
        Queue<Node> queue = new LinkedList<>();
        queue.add(node.left);
        queue.add(node.right);

        while (!queue.isEmpty()) {
            child.add(queue.remove().value);
        }


        parent.add(child);
        return parent;
    }

    public Node findNode(Node node, int x) {
        if (node == null) {
            return null;
        }

        if (node.value == x) {
            return node;
        }

        Node left = findNode(node.left, x);
        if (left != null) {
            return left;
        }

        Node right = findNode(node.right, x);
        return right;

    }

    public static void main(String[] args) {
        BinaryTree binarytree = new BinaryTree();
        binarytree.populate(new Scanner(System.in));
        // binarytree.display();
        binarytree.displayPretty();
        binarytree.findNode(binarytree.root, 4);

    }

}