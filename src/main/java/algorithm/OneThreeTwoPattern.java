package algorithm;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class OneThreeTwoPattern {

    public static void main(String[] args) {


        int[] nums = new int[]{-2, 1, -1};
        OneThreeTwoPattern oneThreeTwoPattern = new OneThreeTwoPattern();
        boolean is132Pattern = oneThreeTwoPattern.find132pattern(nums);

        System.out.println("It is 132 pattern : " + is132Pattern);
    }

    public boolean find132pattern(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (find132(Arrays.copyOfRange(nums, i, nums.length))) {
                return true;
            }
        }


        return false;
    }

    private boolean find132(int[] nums) {
        Integer[] oneThreeTwo = new Integer[3];

        for (int num : nums) {
            if (oneThreeTwo[0] == null || oneThreeTwo[0] >= num) {
                if (oneThreeTwo[1] == null) {
                    oneThreeTwo[0] = num;
                }

                continue;
            }

            if (oneThreeTwo[1] == null || oneThreeTwo[1] <= num) {
                oneThreeTwo[1] = num;
                continue;
            }

            return true;
        }

        return false;
    }
}
