package algorithm;

import java.math.BigDecimal;

public class AddTowNumbers2 {

    public static void main(String... args) {
        AddTowNumbers2 addTowNumbers2 = new AddTowNumbers2();

        ListNode l1 = addTowNumbers2.generateListNode("7243");
        ListNode l2 = addTowNumbers2.generateListNode("564");

        ListNode l3 = addTowNumbers2.addTwoNumbers(l1, l2);

        System.out.println("aa");

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigDecimal l1Number = getNumber(l1);
        BigDecimal l2Number = getNumber(l2);

        BigDecimal result = l1Number.add(l2Number);

        return generateListNode(String.valueOf(result));
    }

    public ListNode generateListNode(String targetStr) {

        ListNode listNode = null;
        if (targetStr.length() > 1) {
            listNode = new ListNode(Integer.valueOf(targetStr.substring(0, 1)), generateListNode(targetStr.substring(1)));
        } else {
            listNode = new ListNode(Integer.valueOf(targetStr.substring(0, 1)));
        }

        return listNode;
    }

    private BigDecimal getNumber(ListNode listNode) {

        StringBuilder sb = null;
        ListNode currentListNode = listNode;


        do {
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(currentListNode.val);
        }
        while ((currentListNode = currentListNode.next) != null);

        return sb == null ? BigDecimal.ZERO : new BigDecimal(sb.toString());
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



