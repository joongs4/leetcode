package algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class TheKWeakestRowsInAMatrix {


    public static void main(String... args) {
        //
//        int[][] mat = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int[][] mat = new int[][]{{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
        int k = 1;

        kWeakestRows(mat, k);
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        //
        int[][] rows = new int[mat.length][2];

        for (int i = 0; i < mat.length; i++) {
            int[] currentMat = mat[i];
            int count = 0;
            for (int temp : currentMat) {
                if (temp == 1) {
                    count++;
                }
            }
            rows[i] = new int[]{i, count};
        }

        Arrays.sort(rows, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if (o1[1] == o2[1]) {
                    return o1[0] < o2[0] ? -1 : 1;
                }
                return o1[1] < o2[1] ? -1 : 1;
            }
        });

        int[] retVal = new int[k];
        for (int i = 0; i < k; i++) {
            retVal[i] = rows[i][0];
        }


        return retVal;
    }

}
