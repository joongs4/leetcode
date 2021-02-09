package algorithm;

import java.text.NumberFormat;

public class DecodeString {

    public static void main(String... args) {


        String eng = "a";
        String num = "4";



//        String input = "3[a]2[bc]";
//        DecodeString decodeString = new DecodeString();
//
//        String output = decodeString.decodeString(input);
//        System.out.println(input + "'s output is " + output);
    }

    public static boolean isInteger(Character inputValue) {
        try {
            Integer.valueOf(inputValue);
            return true;
        } catch (Exception ignoreException) {
            return false;
        }
    }

    public String decodeString(String s) {
        //
        for (char currentChar : s.toCharArray()) {
            if(isInteger(currentChar)){

            }else{

            }

        }


        return null;
    }
}
