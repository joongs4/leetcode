package algorithm;

import java.util.Arrays;

public class KthLargestElementInAnArray {

    public static void main(String... args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int retVal = findKthLargest(nums, k);
        System.out.println("retVal is " + retVal);

    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
