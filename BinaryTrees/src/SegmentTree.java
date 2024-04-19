public class SegmentTree {
    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree() {
    }

    public void constructTree(int[] arr) {
        // create a Binary Tree using this array
        root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        //base condition - at leaf node
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        // create a node with index you are at
        Node node = new Node(start, end);

        // find the middle and create remaining tree
        int middle = start + (end - start) / 2;
        node.left = constructTree(arr, start, middle);
        node.right = constructTree(arr, middle + 1, end);
        // populate the data field for this index - lets assume we are doing sum of numbers. write a function to calculate the sum
        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(root);
    }

    private void display(Node node) {
        String str = "";
        if (node.left != null) {
            str = str + "interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data : " + node.left.data + "=>";
        } else {
            str = str + "no left child";
        }

        str = str + "interval=[" + node.startInterval + "-" + node.endInterval + "] and data : " + node.data + "<=";

        if (node.right != null) {
            str = str + "interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data : " + node.right.data;
        } else {
            str = str + "no right child";
        }

        System.out.println(str + "\n");

        // start the recursion call
        if (node.left != null) {
            display(node.left);
        }

        if (node.right != null) {
            display(node.right);
        }
    }

    // query part
    public int query(int qsi, int qei) {
        return query(root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        // case 1 : if interval lies completely lies between
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            //case 2: completly outside the boundry, so return 0
            return 0;
        } else {
            return query(node.left, qsi, qei) + query(node.right, qsi, qei);
        }
    }

    public void update(int index, int value) {
        root.data = update(root, index, value);
    }

    private int update(Node node, int index, int value) {
        // within the interval
        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                // leaf condition
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        // simply return node data
        return node.data;
    }
}
