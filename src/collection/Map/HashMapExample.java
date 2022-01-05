package collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    Map<String, Integer> map = new HashMap<>();

    public void startHashMap() {
        System.out.println("HashMap");
        map.put("Ronaldo", 7);
        map.put("Messi", 10);
        map.put("Berezutskiy", 77);
        map.put("Hulk", 11);
        map.put("Arshavin", 10);

        System.out.println(map);

        map.remove("Hulk");
        System.out.println(map);

        System.out.println(map.get("Hulk"));

        map.put("No name", 1);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();
//        map.put(3, "New Three");
//        System.out.println(map);
//
//        System.out.println(map.get(3));
//
//        System.out.println(map.get(4));

    }
}
