package algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kakao2 {

    public static void main(String... args) {

        List<String> item1 = new ArrayList<>();
        item1.add("item1");
        item1.add("10");
        item1.add("15");

        List<String> item2 = new ArrayList<>();
        item2.add("item2");
        item2.add("3");
        item2.add("4");

        List<String> item3 = new ArrayList<>();
        item3.add("item3");
        item3.add("17");
        item3.add("8");

        List<List<String>> arr = new ArrayList<>();
        arr.add(item1);
        arr.add(item2);
        arr.add(item3);
        List<String> retVal = solution(arr, 1, 0, 2, 1);
        System.out.println("asd");
    }

    public static List<String> solution(List<List<String>> items, int orderBy, int orderDirection, int pageSize, int pageNumber) {

        List<String> sortedList = items.stream().sorted(new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {

                boolean numberType = o1.get(orderBy).chars().allMatch(Character::isDigit);

                String o1Value = o1.get(orderBy);
                String o2Value = o2.get(orderBy);

                if (orderDirection == 0) {
                    return numberType ? Integer.valueOf(o1Value).compareTo(Integer.valueOf(o2Value)) : o1Value.compareTo(o2Value);
                } else {
                    return numberType ? Integer.valueOf(o2.get(orderBy)).compareTo(Integer.valueOf(o1.get(orderBy))) : o2.get(orderBy).compareTo(o1.get(orderBy));
                }
            }
        }).map(each -> each.get(0)).collect(Collectors.toList());

        int pageTo = Math.min((pageNumber * pageSize) + pageSize, sortedList.size());
        return sortedList.subList(pageNumber * pageSize, pageTo);
    }
}
