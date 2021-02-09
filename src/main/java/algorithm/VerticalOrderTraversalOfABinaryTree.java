package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class VerticalOrderTraversalOfABinaryTree {

    public static void main(String... args) {

//        TreeNode seven = new TreeNode(7);
//        TreeNode fifthTeen = new TreeNode(15);
//        TreeNode twenty = new TreeNode(20, fifthTeen, seven);
//        TreeNode nine = new TreeNode(9);
//        TreeNode root = new TreeNode(3, nine, twenty);


        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode five = new TreeNode(5, six, null);
        TreeNode four = new TreeNode(4, null, seven);
        TreeNode two = new TreeNode(2, five, null);
        TreeNode three = new TreeNode(3, null, four);
        TreeNode one = new TreeNode(1, three, two);
        TreeNode eight = new TreeNode(8);
        TreeNode root = new TreeNode(0, eight, one);


        verticalTraversal(root);

    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        //
        HashMap<Integer, HashMap<Integer, List<Integer>>> store = new HashMap<>();
        traversal(store, root, 0, 0);

        List<Integer> sortedXs = new ArrayList<>(store.keySet());

        Collections.sort(sortedXs);
        List<List<Integer>> retVal = new ArrayList<>();
        for (Integer sortedX : sortedXs) {

            HashMap<Integer, List<Integer>> mapToSorted = store.get(sortedX);
            List<Integer> sortedYs = new ArrayList<>(mapToSorted.keySet());
            Collections.sort(sortedYs);

            List<Integer> listToAdd = new ArrayList<>();
            for (int i = sortedYs.size() - 1; i >= 0; i--) {
                List<Integer> nodeValueList = mapToSorted.get(sortedYs.get(i));
                Collections.sort(nodeValueList);
                listToAdd.addAll(nodeValueList);
            }
            retVal.add(listToAdd);
        }
        return retVal;
    }

    public static void traversal(HashMap<Integer, HashMap<Integer, List<Integer>>> store, TreeNode node, Integer currentX, Integer currentY) {
        //
        HashMap<Integer, List<Integer>> map = store.getOrDefault(currentX, new HashMap<>());
        if (!store.containsKey(currentX)) {
            store.put(currentX, map);
        }
        List<Integer> listToAddMap = map.getOrDefault(currentY, new ArrayList<>());
        listToAddMap.add(node.val);
        if (!map.containsKey(currentY)) {
            map.put(currentY, listToAddMap);
        }

        if (node.left != null) {
            traversal(store, node.left, currentX - 1, currentY - 1);
        }
        if (node.right != null) {
            traversal(store, node.right, currentX + 1, currentY - 1);
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
