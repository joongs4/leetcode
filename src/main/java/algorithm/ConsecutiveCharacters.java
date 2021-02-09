package algorithm;

public class ConsecutiveCharacters {

    public static void main(String[] args) {

//        String input = "leetcode";
        String input = "cc";

        ConsecutiveCharacters consecutiveCharacters = new ConsecutiveCharacters();
        int maxPower = consecutiveCharacters.maxPower(input);
        System.out.println("maxPower of " + input + " is " + maxPower);

    }

    public int maxPower(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxPower = 1;
        int currentPower = 1;

        final char defaultChar = '\u0000';

        char currentChar = defaultChar;
        for (char targetChar : s.toCharArray()) {

            if (currentChar == defaultChar) {
                currentChar = targetChar;
                currentPower = 1;
                continue;
            }

            if (currentChar == targetChar) {
                currentPower++;
            } else {
                maxPower = Math.max(maxPower, currentPower);

                currentPower = 1;
                currentChar = targetChar;
            }
        }


        return Math.max(maxPower, currentPower);
    }
}
