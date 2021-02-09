package algorithm;

import java.util.ArrayList;
import java.util.List;

public class BuddyStrings {

    public static void main(String... args) {
        BuddyStrings buddyStrings = new BuddyStrings();

//        String a = "aaaaaaabc";
//        String b = "aaaaaaacb";
        String a = "abc";
        String b = "bca";

        boolean result = buddyStrings.buddyStrings(a, b);
        System.out.println("a is " + a + ", b is " + b + " , result is " + result);

    }

    public boolean buddyStrings(String A, String B) {
        if (A == null || B == null) {
            return false;
        }

        if (A.length() != B.length()) {
            return false;
        }

        List<Character> unmatchingFromA = new ArrayList<Character>();
        List<Character> unmatchingFromB = new ArrayList<Character>();

        boolean hasSameCharacter = false;

        for (int i = 0; i < A.length(); i++) {

            if (!hasSameCharacter) {
                int count = 0;
                for(int j=0; j<A.length(); j++){
                    if(A.charAt(i) == A.charAt(j)){
                        count++;
                    }
                    if(count>=2){
                        hasSameCharacter = true;
                        continue;
                    }
                }
            }

            if (A.charAt(i) != B.charAt(i)) {
                if (unmatchingFromA.size() >= 2) {
                    return false;
                }

                unmatchingFromA.add(A.charAt(i));
                unmatchingFromB.add(B.charAt(i));
            }
        }

        for (char unmatchinChar : unmatchingFromA) {
            if (!unmatchingFromB.contains(unmatchinChar)) {
                return false;
            }
        }

        if(A.equals(B) && !hasSameCharacter){
            return false;
        }

        return true;
    }
}
