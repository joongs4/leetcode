package practice.bitoperation;

import java.math.BigInteger;

public class BitOperationTester {

    public static void main(String... args) {
        //

        testSplitNumberByBit();
    }

    public static void testBitAnd() {
        int sktWhiteCollarFreshMan = 4105;
        int sktWhiteCollar = 9;


        System.out.println(sktWhiteCollarFreshMan & sktWhiteCollar);

        for (int i = 1; i <= 10000; i++) {
            if (bitAnd(i, sktWhiteCollarFreshMan)) {
                System.out.println("i : " + i + " is contained in " + sktWhiteCollarFreshMan);
            }
        }
    }

    public static void testSplitNumberByBit() {

        int shiftForBigInteger = 64;

        BigInteger bigInteger = new BigInteger("2");
        BigInteger userAccessRules = bigInteger.pow(127).add(BigInteger.ONE);

        BigInteger rightPart = userAccessRules.shiftRight(shiftForBigInteger);
        BigInteger leftPart = userAccessRules.and((BigInteger.ONE.shiftLeft(shiftForBigInteger).subtract(BigInteger.ONE)));

        System.out.println("rightPart is " + rightPart + "(" + rightPart.toString(2) + ")");
        System.out.println("leftPart is " + leftPart + "(" + leftPart.toString(2) + ")");


        long num = 123;
        int shift = 4;

        System.out.println(Long.toBinaryString(num));
        long num1 = num >> shift;
        System.out.println(num1 + " is " + Long.toBinaryString(num1));
        long num2 = num & ((1 << shift) - 1);
        System.out.println(num2 + " is " + Long.toBinaryString(num2));

    }


    private static boolean bitAnd(int a, int b) {
        return (a & b) == a;
    }
}
