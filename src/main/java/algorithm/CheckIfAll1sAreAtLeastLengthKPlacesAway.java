package algorithm;

public class CheckIfAll1sAreAtLeastLengthKPlacesAway {


    public static void main(String... args) {
//        int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
        int[] nums = {1, 0, 0, 1, 0, 1};
        int k = 2;

        boolean retVal = kLengthApart(nums, k);
        System.out.println("retVal is " + retVal);
    }

    public static boolean kLengthApart(int[] nums, int k) {
        //
        int index = -1;
        for (int num : nums) {
            if (num == 1) {
                if (index != -1 && index < k) {
                    return false;
                }
                index = 0;

            } else {
                if (index != -1) {
                    index++;
                }
            }
        }

        return true;
    }
}
