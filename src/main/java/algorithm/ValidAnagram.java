package algorithm;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ValidAnagram {

    public static void main(String... args) {
        //
        String s = "anagram";
        String t = "nagaram";

        isAnagram(s, t);
    }

    public static boolean isAnagram(String s, String t) {
        //
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sourceStore = new HashMap<>();

        for (Character currentChar : s.toCharArray()) {
            Integer count = sourceStore.getOrDefault(currentChar, 0);
            sourceStore.put(currentChar, count + 1);
        }

        for (Character currentChar : t.toCharArray()) {
            Integer count = sourceStore.getOrDefault(currentChar, 0);
            if (count - 1 == 0) {
                sourceStore.remove(currentChar);
            } else {
                sourceStore.put(currentChar, count - 1);
            }
        }
        return sourceStore.isEmpty();

    }
}
