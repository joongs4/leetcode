package algorithm;

public class MergeTwoSortedLists {

    public MergeTwoSortedLists() {

        ListNode one1 = new ListNode(1);
        ListNode two1 = new ListNode(2);
        ListNode four1 = new ListNode(4);

        ListNode one2 = new ListNode(1);
        ListNode three2 = new ListNode(3);
        ListNode four2 = new ListNode(4);

        one1.next = two1;
        two1.next = four1;

        one2.next = three2;
        three2.next = four2;

        mergeTwoLists(one1, one2);

    }

    public static void main(String... args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null || l2 == null) {
            return l1 != null ? l1 : l2;
        }

        ListNode head = null;
        ListNode current = null;

        if (l1.val < l2.val) {
            head = current = l1;
            l1 = l1.next;
        } else {
            head = current = l2;
            l2 = l2.next;
        }

        while (l1 != null || l2 != null) {
            if (l1 == null || l2 == null) {
                current.next = l1 != null ? l1 : l2;
                break;
            }
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        return head;
    }


    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummy = new ListNode(-1);
        ListNode mover = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                mover.next = l1;
                l1 = l1.next;
            } else {
                mover.next = l2;
                l2 = l2.next;
            }
            mover = mover.next;
        }
        if (l1 != null) {
            mover.next = l1;
        }
        if (l2 != null) {
            mover.next = l2;
        }
        return dummy.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
