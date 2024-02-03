public class DoublyLinkList {

    private Node head;
    int size;

    public DoublyLinkList() {
        this.size = 0;
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    public void insertFirst(int val) {
        // create new node
        Node node = new Node(val);
        if (head == null) {
            head = node;
            head.next = null;
            head.prev = null;
            size += 1;
            return;
        }

        node.next = head;
        head.prev = node;
        node.prev = null;
        head = node;
        size += 1;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            insertFirst(val);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;

        size += 1;
    }

    public void insert(int index, int value) {
        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node prev = getNode(index);
        node.next = prev.next;
        prev.next.prev = node;
        prev.next = node;
        node.prev = prev;
    }

    public Node getNode(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + " <=> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Printing in Reverse");
        while (last != null) {
            System.out.print(last.val + " <=> ");
            last = last.prev;
        }
        System.out.println("START");
    }
}
