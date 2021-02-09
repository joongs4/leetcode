package algorithm;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String... args) {
//        String s = "abcabcbb";
        String s = "pwwkew";
//        String s = "au";

        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2(s);

    }

    public int lengthOfLongestSubstring(String s) {

        if (s.length() <= 1) {
            return s.length();
        }

        int maxLength = 0;
        int currentLength = 0;
        char[] temp = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {


            char target = s.charAt(i);
            for (int tempIndex = 0; tempIndex < temp.length; tempIndex++) {
                if (temp[tempIndex] == target) {
                    maxLength = currentLength >= maxLength ? currentLength : maxLength;
                    currentLength = 0;

                    char[] newTemp = new char[s.length()];

                    for (int eachOfTemp = tempIndex + 1; eachOfTemp < temp.length; eachOfTemp++) {
                        currentLength++;
                        if (temp[eachOfTemp] == Character.MIN_VALUE) {
                            break;
                        }
                        newTemp[eachOfTemp - (tempIndex + 1)] = temp[eachOfTemp];
                    }

                    newTemp[currentLength - 1] = target;
                    temp = newTemp;

                    break;
                }

                if (temp[tempIndex] == Character.MIN_VALUE) {
                    temp[tempIndex] = target;
                    currentLength++;
                    break;
                }
            }
        }
        return maxLength >= currentLength ? maxLength : currentLength;
    }


    //BEST ANSWER
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
