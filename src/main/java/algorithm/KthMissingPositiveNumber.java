package algorithm;

public class KthMissingPositiveNumber {


    public static void main(String... args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        KthMissingPositiveNumber kthMissingPositiveNumber = new KthMissingPositiveNumber();
        int retVal = kthMissingPositiveNumber.findKthPositive(arr, k);
        System.out.println("retVal is " + retVal);
    }

    public int findKthPositive(int[] arr, int k) {
        //
        int startIndex = 0;
        for (int i = 1; i <= 2000; i++) {
            boolean containsInArr = false;
            for (int j = startIndex; j < arr.length && j < i; j++) {
                if (arr[j] == i) {
                    containsInArr = true;
                    startIndex = j + 1;
                    break;
                }
            }
            if (!containsInArr) {
                k--;
                if (k <= 0) {
                    return i;
                }
            }
        }
        return 0;
    }
}
