import java.util.LinkedList;

public class LinkList {
    private Node head;
    private Node tail;
    private int size;

    public LinkList() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;
        public Node() {
        }
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFirst(int val) {
        // create new node
        Node newNode = new Node(val);
        // point this to head node
        newNode.next = head;
        //make this node as head node
        head = newNode;
        // if this is the first node
        if (tail == null) {
            tail = head;
        }

        size += 1;

    }

    public void insertAtLast(int val) {
        // check if head is empty then  call the insertAtFirst method
        if (head == null) {
            insertAtFirst(val);
            return;
        }
//        // this is another way of doing it.
//        // create new node
//        Node newNode = new Node(val);
//        // head is null means list is empty
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//            size += 1;
//            return;
//        }

        Node newNode = new Node(val);
        Node temp = head;
        // iterate till last node
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        tail = newNode;
        size += 1;

    }

    public void insert(int val, int index) {
        // insert at first position
        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        // insert at last position
        if (index == size) {
            insertAtLast(val);
            return;
        }
        // go to the index -1 position and insert the new node
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        if (head == null) {
            System.out.println("list is empty, can not delete.");
            return -1;
        }
        int val = head.value;
        Node temp = head;
        head = head.next;

        if (head == null) {
            tail = head;
        }
        // it will get called for garbage collector
        temp.next = null;

        size--;

        return val;
    }

    public int deleteLast() {
        if (head == null) {
            System.out.println("list is empty, can not delete.");
            return -1;
        }
        int val = head.value;
        Node temp = getNode(size - 1);
//        while (temp.next.next != null) {
//            temp = temp.next;
//        }
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int delete(int index) {
        if (head == null) {
            return -1;
        }
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size) {
            return deleteLast();
        }
        Node prev = getNode(index);
//        for (int i = 1; i < index; i++) {
//            prev = prev.next;
//        }
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node getNode(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public Node findNode(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        // node not found
        return null;
    }

    public void insertRec(int value, int index) {
        head = insertRec(value, index, head);
    }

    private Node insertRec(int value, int index, Node node) {
        // base condition
        if (index == 0) {
            Node newNode = new Node(value);
            newNode.next = node;
            size++;
            return newNode;
        }

        node.next = insertRec(value, index - 1, node.next);
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // questions
    public void removeDuplicates() {
// // one way using 2 variable
        //        if (head == null) {
//            return;
//        }
//
//        Node temp = head;
//        Node curr = head;
//
//        while (temp != null) {
//            if (curr.value == temp.value) {
//                temp = temp.next;
//                size--;
//            } else {
//                curr.next = temp;
//                curr = temp;
//            }
//        }
//        // finally make the current node points to temp, now temp is pointing to null
//        curr.next = temp;

        ////// another way of using 1 variable
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        //temp.next = temp;

    }


    public static LinkList merge(LinkList list1, LinkList list2) {
        Node first = list1.head;
        Node second = list2.head;
        // check for empty head condition
        if (first == null && second == null) {
            return null;
        }

        // take the new list
        LinkList ans = new LinkList();
        while (first != null && second != null) {
            if (first.value <= second.value) {
                ans.insertAtLast(first.value);
                first = first.next;
            } else {
                ans.insertAtLast(second.value);
                second = second.next;
            }
        }

        // check for remainings of 1st and second list respectively
        while (first != null) {
            ans.insertAtLast(first.value);
            first = first.next;
        }

        // 2nd list
        while (second != null) {
            ans.insertAtLast(second.value);
            second = second.next;
        }

        return ans;
    }

    public Node mergeTwoLists(Node list1, Node list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        Node temp = new Node();
        Node dummyHead = temp;

        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
//            if (dummyHead == null) {
//                dummyHead = temp;
//            }
        }

        while (list1 != null) {
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        while (list2 != null) {
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }

        return dummyHead;
    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.insertAtLast(1);
        ll.insertAtLast(1);
        ll.insertAtLast(6);
        ll.insertAtLast(8);
        LinkList ll2 = new LinkList();
        ll2.insertAtLast(2);
        ll2.insertAtLast(3);
        ll2.insertAtLast(10);
        ll.display();
        ll2.display();
        LinkList merged = merge(ll, ll2);
        merged.display();
    }


}
