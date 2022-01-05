package collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    Map<String, Integer> treeMap = new TreeMap<>();

    public void startTreeMap() {
        System.out.println("TreeMap");
        treeMap.put("Ronaldo", 7);
        treeMap.put("Messi", 10);
        treeMap.put("Berezutskiy", 77);
        treeMap.put("Hulk", 11);
        treeMap.put("Arshavin", 10);

        System.out.println(treeMap);

        treeMap.remove("Hulk");
        System.out.println(treeMap);

        System.out.println(treeMap.get("Hulk"));

        treeMap.put("No name", 1);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
