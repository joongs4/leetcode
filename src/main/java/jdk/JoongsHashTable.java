package jdk;

import java.util.Hashtable;

public class JoongsHashTable {

    public static void main(String... args) {


        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("a", 1);
        hashtable.put("b", 2);

        hashtable.get("a");

    }
}
