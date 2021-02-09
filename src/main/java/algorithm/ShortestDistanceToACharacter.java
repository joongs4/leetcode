package algorithm;

public class ShortestDistanceToACharacter {
    //
    public static void main(String... args) {

        String s = "loveleetcode";
        char c = 'e';
        shortestToChar(s, c);

    }


    public static int[] shortestToChar(String s, char c) {
        //
        int[] retVal = new int[s.length()];

        int indexOfC = -1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                retVal[i] = 0;
                indexOfC = i;
                for (int j = i - 1; j >= 0; j--) {
                    if (i - j < retVal[j]) {
                        retVal[j] = i - j;
                    } else {
                        break;
                    }
                }
            }

            if (indexOfC == -1) {
                retVal[i] = Integer.MAX_VALUE;
            } else {
                retVal[i] = Math.abs(indexOfC - i);
            }
        }

        return retVal;
    }
}
