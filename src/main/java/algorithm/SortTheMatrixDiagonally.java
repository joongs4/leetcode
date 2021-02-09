package algorithm;

import java.util.*;

public class SortTheMatrixDiagonally {

    public static void main(String... args) {

        int[][] mat = {{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        int[][] retVal = diagonalSort(mat);
        System.out.println("retVal is " + retVal);

    }

    public static int[][] diagonalSort(int[][] mat) {
        //
        int row = mat.length;
        int column = mat[0].length;
        int[][] retVal = new int[row][column];
        for (int rowIndex = row - 1; rowIndex >= 0; rowIndex--) {
            sort(mat, retVal, rowIndex, 0, row, column);
        }

        for (int columnIndex = 0; columnIndex < column; columnIndex++) {
            sort(mat, retVal, 0, columnIndex, row, column);
        }

        return retVal;
    }

    private static void sort(int[][] mat, int[][] retVal, int startRow, int startColumn, int rowLength, int columnLength) {

        int row = startRow;
        int column = startColumn;

        int[] ary = new int[Math.min((rowLength - row), (columnLength - column))];
        int k = -1;

        while (row < rowLength && column < columnLength) {
            ary[++k] = mat[row++][column++];
        }

        Arrays.sort(ary);

        k = -1;

        while (startRow < rowLength && startColumn < columnLength) {
            retVal[startRow++][startColumn++] = ary[++k];
        }
    }
}
