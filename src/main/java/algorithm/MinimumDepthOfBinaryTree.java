package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MinimumDepthOfBinaryTree {


    public static void main(String... args) {

    }

    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        List<TreeNode> treeNodes = new ArrayList();
        if (root.left != null) {
            treeNodes.add(root.left);
        }
        if (root.right != null) {
            treeNodes.add(root.right);
        }


        int minDepth = 1;

        while (true) {
            minDepth++;
            List<TreeNode> tempTreeNodes = new ArrayList<TreeNode>();
            for (TreeNode treeNode : treeNodes) {

                if (treeNode == null) {
                    continue;
                }
                if (isLeafNode(treeNode)) {
                    return minDepth;
                }

                if (treeNode.left != null) {
                    tempTreeNodes.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    tempTreeNodes.add(treeNode.right);
                }
            }
            treeNodes = tempTreeNodes;
        }
    }

    public int findMinDepth(TreeNode targetNode) {


        List<TreeNode> treeNodes = new ArrayList();
        if (targetNode.left != null) {
            treeNodes.add(targetNode.left);
        }
        if (targetNode.right != null) {
            treeNodes.add(targetNode.right);
        }

        int minDepth = 1;

        while (true) {
            minDepth++;
            List<TreeNode> tempTreeNodes = new ArrayList<TreeNode>();
            for (TreeNode treeNode : treeNodes) {

                if (treeNode == null) {
                    continue;
                }
                if (isLeafNode(treeNode)) {
                    return minDepth;
                }

                if (treeNode.left != null) {
                    tempTreeNodes.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    tempTreeNodes.add(treeNode.right);
                }
            }
            treeNodes = tempTreeNodes;
        }
    }

    public boolean isLeafNode(TreeNode treeNode) {
        return treeNode.left == null && treeNode.right == null;
    }


    public class TreeNode {
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
