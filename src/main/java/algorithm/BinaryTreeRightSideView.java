package algorithm;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

    public static void main(String... args) {
        //
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode three = new TreeNode(3, null, four);
        TreeNode two = new TreeNode(2, null, five);
        TreeNode one = new TreeNode(1, two, three);

        rightSideView(one);
    }

    public static List<Integer> rightSideView(TreeNode root) {
        //
        List<Integer> store = new ArrayList<>();
        if (root != null) {
            trace(store, root, 0);
        }
        return store;
    }

    private static void trace(List<Integer> store, TreeNode node, int index) {
        //
        if (store.size() <= index) {
            store.add(node.val);
        }

        if (node.right != null) {
            trace(store, node.right, index + 1);
        }
        if (node.left != null) {
            trace(store, node.left, index + 1);
        }
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
