package collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
    
    public void startLinkedHashMap() {
        System.out.println("LinkedHashMap");
        linkedHashMap.put("Ronaldo", 7);
        linkedHashMap.put("Messi", 10);
        linkedHashMap.put("Berezutskiy", 77);
        linkedHashMap.put("Hulk", 11);
        linkedHashMap.put("Arshavin", 10);

        System.out.println(linkedHashMap);

        linkedHashMap.remove("Hulk");
        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get("Hulk"));

        linkedHashMap.put("No name", 1);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();
    }
}
