package thread;

import java.util.concurrent.*;

public class MainCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            executorService.submit(new Processor(countDownLatch));
        }
        executorService.shutdown();
        countDownLatch.await();
        System.out.println("Latch is opened");
    }
}
