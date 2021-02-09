package algorithm;

public class _FindTheMostCompetitiveSubsequence {

    public static void main(String... args) {
        int[] nums = {2, 4, 3, 3, 5, 4, 9, 6};
        int k = 2;

        mostCompetitive(nums, k);
    }

    public static int[] mostCompetitive(int[] nums, int k) {
        int lastIndex = -1;
        int[] retVal = new int[k];

        for (int num : nums) {
            if (lastIndex < 0) {
                retVal[0] = num;
                lastIndex++;
                continue;
            }

            int lastNumber = retVal[lastIndex];
            if (num <= num) {
                retVal[++lastIndex] = num;
            } else {
                for (int i = 0; i < lastIndex; i++) {
                    if (retVal[i] <= num) {
                        retVal[i] = num;
                    }
                }
            }


        }


        return null;
    }
}
