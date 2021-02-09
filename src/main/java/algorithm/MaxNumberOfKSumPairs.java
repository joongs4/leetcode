package algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class MaxNumberOfKSumPairs {

    public static void main(String... args) {

//        int[] nums = {3, 1, 3, 4, 3};
//        int k = 6;

        int[] nums = {2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2};
//        int[] nums = {2, 1, 1,  1, 2, 1, 2, 2,  2,2};
        int k = 3;

        int retVal = maxOperations(nums, k);
        System.out.println("retVal is " + retVal);
    }

    public static int maxOperations(int[] nums, int k) {
        int maxOperations = 0;

        Map<Integer, Integer> numberStore = new HashMap<>();

        for (int num : nums) {
            if (num >= k) {
                continue;
            }

            int target = numberStore.getOrDefault(k - num, 0);
            if (target == 0) {
                target = numberStore.getOrDefault(num, 0);
                numberStore.put(num, ++target);
            } else {
                maxOperations++;
                numberStore.put(k - num, --target);
            }
        }

        return maxOperations;
    }
}
