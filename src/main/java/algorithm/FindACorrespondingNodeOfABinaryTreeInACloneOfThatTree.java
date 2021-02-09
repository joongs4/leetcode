package algorithm;

import java.util.Stack;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {


    public FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9);
        TreeNode ten = new TreeNode(10);

        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.left = six;
        three.right = seven;
        four.left = eight;
        four.right = nine;
        five.left = ten;

        getTargetCopy(one, null, seven);

    }

    public static void main(String... args) {
        FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree a = new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree();

    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        //
        Stack<TreeNode> nodeStack = new Stack<>();

        TreeNode parent = null;
        TreeNode current = cloned;

        while (true) {
            if (current.val == target.val) {
                break;
            }

            if (parent != null) {
                if (current.equals(parent.left))
                    parent.left = null;
                else
                    parent.right = null;
            }

            if (current.left != null || current.right != null) {
                nodeStack.push(current);
                parent = current;
                current = current.left != null ? current.left : current.right;
            } else if (parent.left != null || parent.right != null) {
                current = parent.left != null ? parent.left : parent.right;
            } else {
                while (true) {
                    parent = nodeStack.pop();
                    current = parent.left != null ? parent.left : parent.right;
                    if (current != null) {
                        break;
                    }
                }
            }
        }


        return current;
    }


    //BEST ANSWER...
    public final TreeNode getTargetCopy2(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        if (cloned == null) {
            return null;
        }
        if (cloned.val == target.val) {
            return cloned;
        }

        TreeNode a = getTargetCopy2(original, cloned.left, target);
        if (a == null) {
            return getTargetCopy2(original, cloned.right, target);
        } else {
            return a;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
