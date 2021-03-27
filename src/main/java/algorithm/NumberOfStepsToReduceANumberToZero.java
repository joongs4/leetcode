package algorithm;

public class NumberOfStepsToReduceANumberToZero {


    public static void main(String... args) {
        //

        int num = 8;

        int retVal = numberOfSteps(num);
        System.out.println("retVal is " + retVal);
    }

    public static int numberOfSteps(int num) {
        //
        if (num == 0) {
            return 0;
        }

        if (num % 2 == 0) {
            return numberOfSteps(num / 2) + 1;
        } else {
            return numberOfSteps(num - 1) + 1;
        }
    }
}
