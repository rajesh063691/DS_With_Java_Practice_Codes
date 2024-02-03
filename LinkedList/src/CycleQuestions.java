public class CycleQuestions {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // find length of the cycle
    public int lengthOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length of the cycle
                ListNode temp = slow.next;
                int length = 1;
                while (temp != slow) {
                    temp = temp.next;
                    length += 1;
                }
                return length;
            }
        }
        return 0;
    }

    // https://leetcode.com/problems/linked-list-cycle-ii/description/
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        boolean isCycle = false;
        ListNode ans = null;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                isCycle = true;
                break;
            }
        }

        if (isCycle) {
            // now iterate temp from head till it meets the fast or slow anyone
            ListNode temp = head;
            while (temp != slow) {
                temp = temp.next;
                slow = slow.next;
            }
            return temp;

        }
        return ans;
    }

    // https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findSquare(int n) {
        int sumOfSquare = 0;
        while (n > 0) {
            int rem = n % 10;
            sumOfSquare += rem * rem;
            n = n / 10;
        }
        return sumOfSquare;
    }


    public static void main(String[] args) {
    }


}
