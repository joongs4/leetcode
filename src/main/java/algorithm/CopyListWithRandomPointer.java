package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CopyListWithRandomPointer {


    public static void main(String... args) {
        //
//        [[7,null],[13,0],[11,4],[10,2],[1,0]]

        Node node7 = new Node(7);
        Node node13 = new Node(13);
        Node node11 = new Node(11);
        Node node10 = new Node(10);
        Node node1 = new Node(1);

        node7.next = node13;
        node13.next = node11;
        node11.next = node10;
        node10.next = node1;

        node7.random = null;
        node13.random = node7;
        node11.random = node1;
        node10.random = node11;
        node1.random = node7;

        copyRandomList(node7);

    }

    public static Node copyRandomList(Node head) {
        //
        List<Node> originalNodes = new ArrayList<>();
        List<Node> copiedNodes = new ArrayList<>();

        Node current = new Node(-1);
        current.next = head;

        Node copiedHead = new Node(-1);
        Node currentCopy = copiedHead;

        while (current.next != null) {
            current = current.next;
            currentCopy.next = new Node(current.val);

            originalNodes.add(current);
            copiedNodes.add(currentCopy.next);

            currentCopy = currentCopy.next;
        }

        for (int i = 0; i < originalNodes.size(); i++) {
            Node originalNode = originalNodes.get(i);
            if (originalNode.random == null) continue;
            copiedNodes.get(i).random = copiedNodes.get(originalNodes.indexOf(originalNode.random));
        }
        return copiedHead.next;
    }

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
