package thread;

public class ThreadPool implements Runnable {

    private int id;

    public ThreadPool(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + "ThreadPool " + id + " was completed");
    }
}
