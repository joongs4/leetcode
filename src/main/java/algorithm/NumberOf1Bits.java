package algorithm;

public class NumberOf1Bits {

    public static void main(String... args) {
        int n = 00000000000000000000000000001011;
        int retVal = hammingWeight(n);

        System.out.println(n + "'s hammingWeight is " + retVal);
    }


    public static int hammingWeight(int n) {
        //
        return Integer.bitCount(n);
    }
}
