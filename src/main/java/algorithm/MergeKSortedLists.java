package algorithm;

import java.security.acl.LastOwnerException;

public class MergeKSortedLists {

    public static void main(String... args) {

        ListNode firstLastNode = new ListNode(5);
        ListNode firstSecondNode = new ListNode(4, firstLastNode);
        ListNode firstNode = new ListNode(1, firstSecondNode);

        ListNode secondLastNode = new ListNode(4);
        ListNode secondSecondNode = new ListNode(3, secondLastNode);
        ListNode secondNode = new ListNode(1, secondSecondNode);

        ListNode thirdLastNode = new ListNode(6);
        ListNode thirdNode = new ListNode(2, thirdLastNode);

        ListNode[] lists = {firstNode, secondNode, thirdNode};
        mergeKLists(lists);

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        //

        ListNode startNode = new ListNode(-1);
        ListNode lastNode = startNode;
        while (true) {

            int smallestIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                if (smallestIndex == -1) {
                    if (lists[i] != null) {
                        smallestIndex = i;
                    }
                    continue;
                }

                ListNode smallestNode = lists[smallestIndex];
                ListNode currentNode = lists[i];

                if (currentNode == null) {
                    continue;
                }

                if (smallestNode.val > currentNode.val) {
                    smallestIndex = i;
                    continue;
                }
            }

            if (smallestIndex < 0) {
                break;
            }

            lastNode.next = new ListNode(lists[smallestIndex].val);
            lists[smallestIndex] = lists[smallestIndex].next;
            lastNode = lastNode.next;
        }


        return startNode.next;
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
