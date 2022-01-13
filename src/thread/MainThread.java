package thread;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("Main thread " + Thread.currentThread());
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        System.out.println(thread.getName());
        thread.start();
    }
}


