package collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    Set<String> linkedHashSet = new LinkedHashSet<>();

    public void startLinkedHashSet() {
        System.out.println("LinkedHashSet");

        linkedHashSet.add("Mike");
        linkedHashSet.add("Steve");
        linkedHashSet.add("Carl");
        linkedHashSet.add("Alex");
        linkedHashSet.add("Aalex");
        linkedHashSet.add("Bob");
        
        for (String name : linkedHashSet) {
            System.out.println(name);
        }
        System.out.println();
    }
}
