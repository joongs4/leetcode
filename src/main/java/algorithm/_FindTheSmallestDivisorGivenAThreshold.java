package algorithm;

public class _FindTheSmallestDivisorGivenAThreshold {

    public static void main(String... args) {

        _FindTheSmallestDivisorGivenAThreshold findTheSmallestDivisorGivenAThreshold = new _FindTheSmallestDivisorGivenAThreshold();
//        int output = findTheSmallestDivisorGivenAThreshold.smallestDivisor(new int[]{1, 2, 3}, 6);
//        int output = findTheSmallestDivisorGivenAThreshold.smallestDivisor(new int[]{19}, 5);
        int output = findTheSmallestDivisorGivenAThreshold.smallestDivisor(new int[]{1,2,3}, 1000000);
        System.out.println("output is " + output);

    }

    public int smallestDivisor(int[] nums, int threshold) {

        int divisor = threshold / nums.length;
        if (nums.length == 1) {
            divisor--;
        }

        boolean isDone = false;
        boolean isMinus = false;

        while (!isDone) {

            int sum = 0;

            for (int num : nums) {

                int addToSum = num / divisor;
                if (addToSum == 0 || num % divisor != 0) {
                    addToSum++;
                }
                sum += addToSum;
            }

            if (sum == threshold) {
                isDone = true;
            } else if (sum < threshold) {
                if (sum + 1 == threshold) {
                    isDone = true;
                } else {
                    isMinus = true;
                }
            }

            if (!isDone) {
                if (isMinus) {
                    divisor--;
                } else {
                    divisor++;
                }
            }


        }


        return divisor;
    }
}
