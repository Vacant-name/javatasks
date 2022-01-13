package thread;

public class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("My Thread " + Thread.currentThread());
    }
}
