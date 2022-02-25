package thread;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainProducerConsumer {
    static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                produce();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    static void produce() {
        Random random = new Random();
        while (true) {
            try {
                queue.put(random.nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static void consume() throws InterruptedException {
        Random random = new Random();
        while (true) {
            if (queue.contains(random.nextInt(10))) {
                System.out.println("Num is " + queue.take());
                System.out.println("Size is " + queue.size());
            }
        }
    }
}
