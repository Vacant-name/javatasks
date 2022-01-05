package collection.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    List<Integer> linkedList = new LinkedList<>();

    public void startLinkedList() {
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        System.out.println("LinkedList");

        long time1 = System.currentTimeMillis();
        System.out.println("get " + linkedList.get(9999));
        System.out.println("Time get " + (System.currentTimeMillis() - time1) + "ms");

        long time2 = System.currentTimeMillis();
        linkedList.set(2558,4);
        System.out.println("set " +linkedList);
        System.out.println("Time set " + (System.currentTimeMillis() - time2) + "ms");

        long time3 = System.currentTimeMillis();
        linkedList.remove(5045);
        System.out.println("remove " + linkedList);
        System.out.println("Time remove " + (System.currentTimeMillis() - time3) + "ms");

        long time4 = System.currentTimeMillis();
        linkedList.add(0,1);
        System.out.println("add " + linkedList);
        System.out.println("Time add " + (System.currentTimeMillis() - time4) + "ms");
    }
}

