package thread;

import java.util.concurrent.CountDownLatch;

public class Processor implements Runnable {
    CountDownLatch countdownlatch;
    public Processor(CountDownLatch countdownlatch) {
        this.countdownlatch = countdownlatch;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countdownlatch.countDown();
    }
}
