package thread;

public class MainSynchronizedBlock {
    private int count;
    public static void main(String[] args) throws InterruptedException {
        new SynchronizedBlock().counterTime();
    }
}
