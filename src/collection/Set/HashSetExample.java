package collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    Set<String> hashSet1 = new HashSet<>();
    Set<String> hashSet2 = new HashSet<>();

    public void startHashSet() {
        System.out.println("HashSet");

        hashSet1.add("Mike");
        hashSet1.add("Steve");
        hashSet1.add("Carl");
        hashSet1.add("Alex");
        hashSet1.add("Aalex");
        hashSet1.add("Bob");

        hashSet2.add("Mike1");
        hashSet2.add("Steve1");
        hashSet2.add("Carl1");
        hashSet2.add("Alex");
        hashSet2.add("Aalex1");
        hashSet2.add("Bob1");
        // объединение множеств
        Set<String> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println(union);
        System.out.println();
        //пересечение множеств
        Set<String> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2);
        System.out.println(intersection);
        // различие множеств
        Set<String> difference = new HashSet<>(hashSet1);
        difference.removeAll(hashSet2);
        System.out.println(difference);



//        for (String name : hashSet) {
//            System.out.println(name);
//        }
//        System.out.println();
    }
}
