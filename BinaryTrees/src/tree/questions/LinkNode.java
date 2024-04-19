package tree.questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkNode {
    private class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    // https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
    // approach --- 1
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelCount = queue.size();
            for (int i = 0; i < levelCount; i++) {

                Node currentNode = queue.poll();
                // this is last node in the current level, so point its next to NULL
                if (i == levelCount - 1) {
                    currentNode.next = null;
                } else {
                    // point current node's next to peek(first) node in the queue
                    currentNode.next = queue.peek();
                }

                // add both left and right to the queue
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        return root;
    }

    // approach --- 2
    public Node connect2(Node root) {
        if (root == null) {
            return root;
        }
        Node leftMost = root;
        while (leftMost.left != null) {
            Node current = leftMost;
            while (current != null) {
                current.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }

        return root;
    }
}