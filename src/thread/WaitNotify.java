package thread;

import java.util.Scanner;

public class WaitNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started ");
            this.wait(); // отдаем lock(монитор) другому потоку и ждем notify
            System.out.println("Producer thread resumed ");
        }
    }
    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner sc = new Scanner(System.in);
        synchronized (this) {
            System.out.println("Waiting for return key pressed ");
            sc.nextLine();
            System.out.println("Ready to continue ");
            Thread.sleep(2000);
            this.notify();
            Thread.sleep(2000);
        }
    }
}
