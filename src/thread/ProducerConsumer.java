package thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProducerConsumer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }
    public void consume() throws InterruptedException {
        int value;
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    lock.wait();
                }
                value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size " + queue.size());
                lock.notify();
            }
            Thread.sleep(1000);
        }
    }
}
