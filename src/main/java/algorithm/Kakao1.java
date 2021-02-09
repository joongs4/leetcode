package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Kakao1 {


    public static void main(String... args) {


        List<String> one = new ArrayList<>();
        one.add("Apeach");
        one.add("Frodo");
        one.add("2");

        List<String> two = new ArrayList<>();
        two.add("Frodo");
        two.add("Apeach");
        two.add("2");

        List<String> three = new ArrayList<>();
        three.add("Tube");
        three.add("Apeach");
        three.add("5");

        List<String> four = new ArrayList<>();
        four.add("Frodo");
        four.add("Tube");
        four.add("7");

        List<String> five = new ArrayList<>();
        five.add("Apeach");
        five.add("Frodo");
        five.add("4");

        List<String> six = new ArrayList<>();
        six.add("Apeach");
        six.add("Tube");
        six.add("4");

        List<List<String>> arr = new ArrayList<>();
        arr.add(one);
        arr.add(two);
        arr.add(three);
        arr.add(four);
        arr.add(five);
        arr.add(six);

        solution(arr);

    }

    public static List<String> solution(List<List<String>> arr) {
        HashMap<String, Integer> storage = new HashMap<>();
        for (List<String> each : arr) {
            String borrowedPerson = each.get(0);
            String rentalPerson = each.get(1);
            int point = Integer.valueOf(each.get(2));
            if (!storage.containsKey(borrowedPerson)) {
                storage.put(borrowedPerson, 0);
            }
            storage.put(borrowedPerson, storage.get(borrowedPerson) - point);

            if (!storage.containsKey(rentalPerson)) {
                storage.put(rentalPerson, 0);
            }

            storage.put(rentalPerson, storage.get(rentalPerson) + point);
        }
        int minValue = 0;
        for (int currentValue : storage.values()) {
            minValue = Math.min(currentValue, minValue);
        }

        List<String> retVal = new ArrayList<>();

        if (minValue == 0) {
            retVal.add("None");
        } else {
            for (String entryKey : storage.keySet()) {
                if (storage.get(entryKey).equals(minValue)) {
                    retVal.add(entryKey);
                }
            }
            retVal = retVal.stream().sorted().collect(Collectors.toList());
        }

        return retVal;
    }
}
