package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new ThreadPool(i));
        }
        executorService.shutdown();
        System.out.println("all tasks submitted");
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}
