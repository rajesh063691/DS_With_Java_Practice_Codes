import java.util.List;

public class MergeSortList {

    private ListNode head;

    public MergeSortList() {
        this.head = null;
    }

    private class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode() {
        }
    }

    public void insertAtLast(int val) {
        // check if head is empty then  call the insertAtFirst method
        if (head == null) {
            ListNode newNode = new ListNode(val);
            head = newNode;
            newNode.next = null;
            return;
        }
        ListNode newNode = new ListNode(val);
        ListNode temp = head;
        // iterate till last node
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMidNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);

    }

    private ListNode getMidNode(ListNode head) {
        ListNode midPrev = null;

        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        ListNode mid = null;
        if (midPrev != null) {
            mid = midPrev.next;
            midPrev.next = null;
        }

        return mid;
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    private ListNode merge(ListNode left, ListNode right) {

        ListNode dummyHead = new ListNode();
        ListNode temp = dummyHead;

        while (left != null && right != null) {
            if (left.val < right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        temp.next = (left != null) ? left : right;

        return dummyHead.next;
    }

    // using recursion
    public ListNode reverseList(ListNode node) {
        if (node.next == null) {
            head = node;
            return head;
        }
        ListNode tail = reverseList(node.next);
        tail.next = node;
        node.next = null;
        tail = tail.next;

        return tail;
    }

    // in place reverse if linked list
    public ListNode reverseInPlaceList(ListNode head) {
        ListNode curr = head;
        ListNode next = head;
        ListNode prev = null;

        while (next != null) {
            next = next.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip my first left-1 node
        ListNode curr = head;
        ListNode prev = null;
        for (int i = 0; curr != null && i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }

        ListNode first = prev;
        ListNode newEnd = curr;
        // reverse the list between left and right
        ListNode next = curr.next;
        for (int i = 0; curr != null && i < right - left + 1; i++) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (first != null) {
            first.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = curr;

        return head;

    }


    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode mid = getMidNode(head);
        ListNode secondHead = reverseList(mid);
        ListNode rereverseHead = secondHead;

        // compare both the halves
        while (head != null && secondHead != null) {
            if (head.val != secondHead.val) {
                return false;
            }
            head = head.next;
            secondHead = secondHead.next;
        }

        reverseList(rereverseHead);

        return (head == null || secondHead == null);

    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = getMid(head);
        ListNode hf = head;
        ListNode hs = reverseInPlaceList(mid);

        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;

        }

        if (hf != null) {
            hf.next = null;
        }


    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        // find if we have k node available
        boolean isNodePresent = isNodeAvailable(head, k);
        ListNode prev = null;
        ListNode curr = head;

        while (isNodePresent) {
            ListNode first = prev;
            ListNode newEnd = curr;
            // reverse the list between left and right
            ListNode next = curr.next;
            for (int i = 0; curr != null && i < k; i++) {
                curr.next = prev;
                prev = curr;
                curr = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (first != null) {
                first.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = curr;
            prev = newEnd;
            isNodePresent = isNodeAvailable(curr, k);
            if (!isNodePresent) {
                break;
            }
        }
        return head;
    }

    private boolean isNodeAvailable(ListNode head, int k) {
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return false;
            }
            temp = temp.next;

        }
        return true;
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k <= 0) {
            return head;
        }

        for (int i = 0; i < k; i++) {
            ListNode tempHead = head;
            ListNode prev = null;
            ListNode curr = head;
            ListNode next = curr.next;

            while (next != null) {
                prev = curr;
                curr = curr.next;
                next = next.next;
            }
            prev.next = null;
            curr.next = tempHead;
            head = curr;
        }

        return head;

    }

    public ListNode rotateRight2(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // find the length of the list
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        // iterate till count-2 nodes
        k = k % count;
        if (k == 0) {
            return head;
        }

        for (int i = 1; i < (count - k); i++) {
            temp = temp.next;
        }

        // here temp will point to just previous  of last k nodes
        ListNode curr = temp.next;
        temp.next = null;

        ListNode tempHead = curr;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = head;
        head = tempHead;

        return head;

    }

    public ListNode rotateRight3(ListNode head, int k) {

        if (head == null || head.next == null || k <= 0) {
            return head;
        }

        // find the length of the list
        ListNode temp = head;
        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        temp.next = head;

        // iterate till count-k nodes
        int rotation = k % count;
        int skip = count - rotation;
        ListNode newLast = head;
        for (int i = 1; i < skip; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;

    }

    public static void main(String[] args) {
        MergeSortList list = new MergeSortList();
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.display();

//        list.sortList(list.head);
//        list.display();

//        list.reverseList(list.head);
//        list.display();

        //MergeSortList newlist = new MergeSortList();
//        MergeSortList newlist = new MergeSortList();
//        newlist.head = list.reverseInPlaceList(list.head);
        // newlist.display();

        MergeSortList newlist = new MergeSortList();
        newlist.head = list.rotateRight(list.head, 1);
        newlist.display();

    }


}
