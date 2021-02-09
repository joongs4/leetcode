package algorithm;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String... args) {

        String s = "()[]{}";
        boolean valid = isValid(s);
        System.out.println(s + " is valid : " + valid);

    }

    public static boolean isValid(String s) {

        Stack<Character> characterStack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                characterStack.push(c);
            } else {
                if (characterStack.isEmpty()) {
                    return false;
                }
                Character target = characterStack.pop();

                if (c == ')') {
                    if (target != '(') {
                        return false;
                    }
                } else if (c == ']') {
                    if (target != '[') {
                        return false;
                    }
                } else if (c == '}') {
                    if (target != '{') {
                        return false;
                    }
                }
            }

        }

        return characterStack.isEmpty();
    }
}
