package algorithm;

import java.util.Arrays;

public class SearchA2DMatrix {

    public static void main(String... args) {
        SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int target = 3;
        boolean exists = searchA2DMatrix.searchMatrix(matrix, target);
        if (exists) {
            System.out.println(target + " exists in the matrix");
        } else {
            System.out.println(target + " does not exists in the matrix");
        }

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        //
        int[] suspectedList = null;
        if (matrix == null) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {

            int[] targetList = matrix[i];
            if (targetList == null || targetList.length < 1) {
                return false;
            }
            if (targetList[0] == target) {
                return true;
            }

            if (targetList[0] > target) {
                return false;
            }

            if (i == matrix.length - 1) {
                suspectedList = targetList;
                break;
            }

            if (matrix[i + 1][0] > target) {
                suspectedList = targetList;
                break;
            }
        }

        if (suspectedList == null) {
            return false;
        }
        return Arrays.binarySearch(suspectedList, target) >= 0;
    }

}
