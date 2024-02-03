public class CircularLinkedList {
    Node head;
    Node tail;
    private int size;

    public CircularLinkedList() {
        this.size = 0;
    }

    public CircularLinkedList(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    private class Node {
        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }

    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            size += 1;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size += 1;
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            System.out.println("can not delete, list is empty");
            return;
        }
        // deleting the head node
        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n != null) {
                if (n.value == val) {
                    node.next = n.next;
                    break;
                }
            }
            node = node.next;
        } while (node != head);

    }

    public void display() {
        Node temp = head;
        if (temp != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("HEAD");
    }
}
