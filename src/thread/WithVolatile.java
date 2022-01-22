package thread;

public class WithVolatile extends Thread {
    private volatile boolean running = true; // for coherency of caches
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown() {
        this.running = false;
    }
}
