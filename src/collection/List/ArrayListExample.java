package collection.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    List<Integer> arrayList = new ArrayList<>();

    public void startArrayList() {
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList");

        long time1 = System.currentTimeMillis();
        System.out.println("get " + arrayList.get(9999));
        System.out.println("Time get " + (System.currentTimeMillis() - time1) + "ms");

        long time2 = System.currentTimeMillis();
        arrayList.set(2558,4);
        System.out.println("set " +arrayList);
        System.out.println("Time set " + (System.currentTimeMillis() - time2) + "ms");

        long time3 = System.currentTimeMillis();
        arrayList.remove(5045);
        System.out.println("remove " + arrayList);
        System.out.println("Time remove " + (System.currentTimeMillis() - time3) + "ms");

        long time4 = System.currentTimeMillis();
        arrayList.add(0,1);
        System.out.println("add " + arrayList);
        System.out.println("Time add " + (System.currentTimeMillis() - time4) + "ms");
        System.out.println();

        // list.clone(); works only with "ArrayList<Integer> list = new ArrayList<>();"
    }
}
