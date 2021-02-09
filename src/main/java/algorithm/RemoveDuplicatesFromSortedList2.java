package algorithm;

public class RemoveDuplicatesFromSortedList2 {

    public RemoveDuplicatesFromSortedList2() {

        ListNode one = new ListNode(1);
        ListNode one2 = new ListNode(1);
        ListNode one3 = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode three2 = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode four2 = new ListNode(4);
        ListNode five = new ListNode(5);


        one.next = one2;
//        one2.next = one3;
//        one3.next = two;
//        two.next = three;

//        one.next = two;
//        two.next = three;
//        three.next = three2;
//        three2.next = four;
//        four.next = four2;
//        four2.next = five;

        deleteDuplicates(one);

    }

    public static void main(String... args) {
        RemoveDuplicatesFromSortedList2 removeDuplicatesFromSortedList2 = new RemoveDuplicatesFromSortedList2();

    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;
        ListNode previous = null;
        boolean duplicated = false;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                duplicated = true;
            } else {
                if (duplicated) {
                    if (previous == null) {
                        head = current.next;
                    } else {
                        previous.next = current.next;
                    }
                } else {
                    previous = current;
                }
                duplicated = false;
            }
            current = current.next;
        }

        if (duplicated) {
            if (previous != null) {
                previous.next = null;
            } else {
                return null;
            }
        }
        return head;
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
