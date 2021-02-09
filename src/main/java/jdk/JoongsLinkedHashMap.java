package jdk;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class JoongsLinkedHashMap {

    public static void main(String... args) {
        JoongsLinkedHashMap joongsLinkedHashMap = new JoongsLinkedHashMap();
    }

    public JoongsLinkedHashMap() {

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("강아지", "뚱이");
        linkedHashMap.put("고양이", "나비");
        linkedHashMap.put("사슴", "꽃분이");

        linkedHashMap.put("강아지1", "뚱이1");
        linkedHashMap.put("고양이1", "나비1");
        linkedHashMap.put("사슴1", "꽃분이1");

        linkedHashMap.put("강아지2", "뚱이2");
        linkedHashMap.put("고양이2", "나비2");
        linkedHashMap.put("사슴2", "꽃분이2");

        linkedHashMap.put("강아지3", "뚱이3");
        linkedHashMap.put("고양이3", "나비3");
        linkedHashMap.put("사슴3", "꽃분이3");

        linkedHashMap.get("강아지3");

        for(String key : linkedHashMap.keySet()){
            System.out.println(key);
        }

        linkedHashMap.entrySet();


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.entrySet();
        hashMap.get("");
    }
}
