package algorithm;

public class MinimumOperationsToReduceXToZero {

    public static void main(String... args) {
//        int[] nums = {1, 1, 4, 2, 3};
//        int x = 5;

        int[] nums = {5,6,7,8,9};
        int x = 4;

        int retVal = minOperations(nums, x);
        System.out.println("result is " + retVal);
    }

    public static int minOperations(int[] nums, int x) {
        //
        if (nums[0] == x && nums[nums.length - 1] == x) {
            return 1;
        }

        if (nums[0] > x && nums[nums.length - 1] > x) {
            return -1;
        }


        return 0;
    }
}
