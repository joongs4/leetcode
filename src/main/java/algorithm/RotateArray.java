package algorithm;

public class RotateArray {

    public static void main(String... args) {

        RotateArray rotateArray = new RotateArray();

        int[] a = new int[]{-1, -100, 3, 99};

        rotateArray.rotate(a, 2);
//        for (int num : a) {
//            System.out.print(num + ", ");
//
//        }

    }

    public void rotate(int[] nums, int k) {
        //
        if (k == 0 || nums.length <= 1) {
            return;
        }

        if (nums.length <= k && k % nums.length == 0 ) {
            return;
        }

        int steps = nums.length > k ? k : k % nums.length;

        int[] copiedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int targetIndex = 0;
            if (i + steps > nums.length - 1) {
                targetIndex = (i + steps) - nums.length;
            } else {
                targetIndex = i + steps;
            }
            copiedNums[targetIndex] = nums[i];
        }

        for(int i=0; i< nums.length; i++){
            nums[i] = copiedNums[i];
        }

        for (int num : nums) {
            System.out.print(num + ", ");
        }
    }
}
