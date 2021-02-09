package practice.regex;

import java.util.regex.Pattern;

public class RegExTester {

    public static void main(String... args) {


        String userAccess = "100010011101111";

        String targetRole1 = "1..1.....1.";
        String targetRole2 = "1.1.1";
        String targetRole3 = "111.11..";
        String targetRole4 = "1......1...";

        String targetRole5 = "11.111.....";
        String targetRole6 = "11.......";

        String targetRole7 = "1...1......1111";

        bitAnd(targetRole1, userAccess);
        bitAnd(targetRole2, userAccess);
        bitAnd(targetRole3, userAccess);
        bitAnd(targetRole4, userAccess);
        bitAnd(targetRole5, userAccess);
        bitAnd(targetRole6, userAccess);
        bitAnd(targetRole7, userAccess);

    }

    public static boolean bitAnd(String contentRole, String userAccess) {
        boolean matches = Pattern.matches("\\w*" + contentRole+"$", userAccess);

        if (matches) {
            System.out.println(userAccess + "contains " + contentRole);
        } else {
            System.out.println(userAccess + "does not contain " + contentRole);
        }
        
        return matches;
    }
}
