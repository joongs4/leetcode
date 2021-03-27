package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LinkedListCycle {


    public static void main(String... args) {
        ListNode listMinus4 = new ListNode(-4);
        ListNode list0 = new ListNode(0);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);

        list3.next = list2;
        list2.next = list0;
        list0.next = listMinus4;
        listMinus4.next = list3;

        hasCycle(list3);
    }

    public static boolean hasCycle(ListNode head) {
        //
        HashSet<ListNode> nodeList = new HashSet<>();

        while (head != null) {

            if (nodeList.contains(head)) {
                return true;
            }
            nodeList.add(head);
            head = head.next;

        }
        return false;


    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
