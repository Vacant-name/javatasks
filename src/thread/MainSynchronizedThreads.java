package thread;

public class MainSynchronizedThreads {
    private int count;
    public static void main(String[] args) throws InterruptedException {
        MainSynchronizedThreads mainSynchronizedThreads = new MainSynchronizedThreads();
        mainSynchronizedThreads.doWork();
    }

//    public synchronized void inc() {
//        count++;
//    }

    public void inc() {
        synchronized (this) {
            count++;
        }
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    inc();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000 ; i++) {
                    inc();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count);
    }
}
