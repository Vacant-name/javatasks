package fromCompanies;

import java.util.Random;

public class NumbersMain {
    public static void main(String[] args) throws Exception {


        int[] arrRand = new int[10];

        Random random = new Random();
        for (int i =0; i < arrRand.length; i++) {
            arrRand[i] = random.nextInt(arrRand.length - 1);
        }

        Numbers numbers = new Numbers(arrRand);

        long time1 = System.currentTimeMillis();
        numbers.solveArrayList();
        System.out.println("Array " + (System.currentTimeMillis() - time1));

//        long time2 = System.currentTimeMillis();
//        numbers.solveLinkedList();
//        System.out.println("Linked " + (System.currentTimeMillis() - time2));
//
//        long time3 = System.currentTimeMillis();
//        numbers.solveLinkedHashSet();
//        System.out.println(System.currentTimeMillis() - time3);

    }
}
