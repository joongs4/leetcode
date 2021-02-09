package algorithm;

public class CheckIfTwoStringArraysAreEquivalent {

    public static void main(String... args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};

        CheckIfTwoStringArraysAreEquivalent checkIfTwoStringArraysAreEquivalent = new CheckIfTwoStringArraysAreEquivalent();
        checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2);
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder word1Sb = new StringBuilder();
        StringBuilder word2Sb = new StringBuilder();

        for (String each : word1) {
            word1Sb.append(each);
        }

        for (String each : word2) {
            word2Sb.append(each);
        }

        return word1Sb.toString().equals(word2Sb.toString());
    }
}
