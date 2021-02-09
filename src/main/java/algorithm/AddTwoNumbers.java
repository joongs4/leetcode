package algorithm;

public class AddTwoNumbers {


    public static void main(String... args) {
        ListNode lOne2 = new ListNode(2);
        ListNode lOne4 = new ListNode(4);
        ListNode lOne3 = new ListNode(3);

        lOne2.next = lOne4;
        lOne4.next = lOne3;

        ListNode lTwo5 = new ListNode(5);
        ListNode lTwo6 = new ListNode(6);
        ListNode lTwo4 = new ListNode(4);

        lTwo5.next = lTwo6;
        lTwo6.next = lTwo4;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(lOne2, lTwo5);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //
        ListNode head = new ListNode(0);
        ListNode previous = head;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;

            int sum = num1 + num2 + carry;
            carry = sum / 10;
            previous.next = new ListNode(sum % 10);
            previous = previous.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            previous.next = new ListNode(carry);
        }

        return head.next;
    }

    public static class ListNode {
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
