package thread;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        MyThread myThread2 = new MyThread();
//        myThread2.start();


//        Thread thread = new Thread(new ExtendsFromRunnable());
//        thread.start();
//        System.out.println("Hello");

        WithVolatile withVolatile = new WithVolatile();
        withVolatile.start();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        withVolatile.shutdown();
    }
}


