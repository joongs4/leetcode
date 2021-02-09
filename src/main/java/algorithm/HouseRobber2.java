package algorithm;

public class HouseRobber2 {


    public static void main(String[] args) {
        HouseRobber2 houseRobber2 = new HouseRobber2();
        int[] nums = new int[]{1};
        int totalAmount = houseRobber2.rob(nums);
        System.out.println("Total amount you can rob is " + totalAmount);
    }


    public int rob(int[] nums) {

        int odd = 0;
        int even = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums.length > 1 && i == nums.length - 1 && nums.length % 2 != 0) {
                break;
            }

            if (i % 2 == 0) {
                odd += nums[i];
            } else {
                even += nums[i];
            }

        }


        return odd >= even ? odd : even;
    }

}