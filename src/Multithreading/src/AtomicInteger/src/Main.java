import java.util.concurrent.atomic.AtomicInteger;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter inventoryCounter = new Counter();
        incThread incT = new incThread(inventoryCounter);
        decThread decT = new decThread(inventoryCounter);

        incT.start();
        decT.start();

        incT.join();
        decT.join();

        System.out.println("Current Value: " + inventoryCounter.getValues());
    }

    public static class decThread extends Thread {

        private final Counter iCounter;

        public decThread(Counter iCounter) {
            this.iCounter = iCounter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                iCounter.decrement();
            }
        }
    }

    public static class incThread extends Thread {

        private final Counter iCounter;

        public incThread(Counter iCounter) {
            this.iCounter = iCounter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++)
                iCounter.increment();
        }
    }

    private static class Counter {
        private final AtomicInteger values = new AtomicInteger(0);

        public void increment() {
            values.incrementAndGet();
        }

        public void decrement() {
            values.decrementAndGet();
        }

        public int getValues() {
            return values.get();
        }
    }
}
