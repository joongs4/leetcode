package algorithm;

import java.math.BigDecimal;
import java.math.BigInteger;


public class ConcatenationOfConsecutiveBinaryNumbers {


    public static void main(String... args) {
        int n = 42904;

        int retVal = concatenatedBinary(n);
        System.out.println(n + " is " + retVal);


    }

    public static int concatenatedBinary(int n) {
        //
//        BigInteger total = BigInteger.ZERO;
//        int index = 0;
//        for (int i = n; i > 0; i--) {
//
//            BigInteger integerToAdd = BigInteger.valueOf(i);
//            total = total.add(integerToAdd.shiftLeft(index));
//            index += integerToAdd.toString(2).length();
//        }
//
//        return total.mod(new BigInteger("1000000007")).intValue();

        long total = 0;
        int index = 0;
        for (long i = n; i > 0; i--) {

            total += i << index;
            index += Integer.toBinaryString((int) i).length();
        }

        return (int) (total % 1000000007l);
    }
}
