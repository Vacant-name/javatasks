package collection.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    Set<String> treeSet = new TreeSet<>();

    public void startTreeSet() {
        System.out.println("TreeSet");

        treeSet.add("Mike");
        treeSet.add("Steve");
        treeSet.add("Carl");
        treeSet.add("Alex");
        treeSet.add("Aalex");
        treeSet.add("Bob");
        
        for (String name : treeSet) {
            System.out.println(name);
        }
    }

}
