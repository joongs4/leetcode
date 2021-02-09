package algorithm;

import java.util.Arrays;

public class MergeSortedArray {


    public static void main(String... args) {
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {2, 5, 6};
//        int n = 3;

//        int[] nums1 = {0};
//        int m = 0;
//        int[] nums2 = {1};
//        int n = 1;

        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, m, nums2, n);

        System.out.println("a");
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        } else if (n == 0) {
            return;
        }

        m--;
        n--;

        while (true) {
            if (n < 0) {
                return;
            }

            int indexToSet = m + n + 1;
            int num1 = m < 0 ? Integer.MIN_VALUE : nums1[m];

            if (num1 > nums2[n]) {
                nums1[indexToSet] = num1;
                m--;
            } else {
                nums1[indexToSet] = nums2[n];
                n--;
            }
        }
    }
}
