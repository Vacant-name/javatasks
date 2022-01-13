package leetCode;

public class MyThread extends Thread {
    String s;
    public MyThread(String name) {
        s = name;
    }

    public void run() {
        System.out.println("I'm Running!");
    }

    public static void main(String[] args) {
        System.out.println("About to run thread");
        new MyThread("Run, Thread, Run!").start();
    }
}
