public class Main {
    public static void main(String[] args) {

        // Singly LInked List
        LinkList list = new LinkList();
        list.insertAtFirst(5);
        list.insertAtFirst(10);
        list.insertAtFirst(15);
        list.insertAtFirst(20);

        list.insertAtLast(12);
        list.insertAtLast(13);
        list.insertAtLast(14);
        list.insertAtLast(15);

        list.insert(3, 4);
        list.insert(2, 5);
        list.insert(1, 6);
        list.display();
        list.insertRec(90, 3);
        list.display();
//
//        list.display();
//        System.out.println(list.deleteFirst());
//
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println(list.delete(1));
//        list.display();
//        System.out.println(list.findNode(15));

        // // Doubly Linked List
//        DoublyLinkList dlist = new DoublyLinkList();
//        dlist.insertFirst(16);
//        dlist.insertFirst(14);
//        dlist.insertFirst(12);
//        dlist.insertFirst(10);
//        dlist.display();
//        dlist.insertLast(18);
//        dlist.display();
//        dlist.insert(2, 13);
//        dlist.display();


//        CircularLinkedList clist = new CircularLinkedList();
//        clist.insert(1);
//        clist.insert(4);
//        clist.insert(8);
//        clist.insert(12);
//        clist.display();
//        clist.delete(1);
//        clist.display();


    }
}