import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        sharedObjectClass sharedObject = new sharedObjectClass();
        incThread incThread = new incThread(sharedObject);
        DecrementingThread decrementingThread = new DecrementingThread(sharedObject);

        incThread.start();
        decrementingThread.start();

        incThread.join();
        decrementingThread.join();

        System.out.println("We currently have " + sharedObject.getVal() + " items");
    }

    public static class DecrementingThread extends Thread {

        private sharedObjectClass sharedObject;

        public DecrementingThread(sharedObjectClass sharedObjectClass) {
            this.sharedObject = sharedObjectClass;
        }

        @Override
        public void run() {
            LongStream.range(0, 100000).forEach(i -> sharedObject.decrement());
        }
    }

    public static class incThread extends Thread {

        private sharedObjectClass sharedObject;

        public incThread(sharedObjectClass sharedObjectClass) {
            this.sharedObject = sharedObjectClass;
        }

        @Override
        public void run() {
            LongStream.range(0, 100000).forEach(i -> sharedObject.increment());
        }
    }

    private static class sharedObjectClass {
        private int val = 0;

        public void increment() {
            val++;
        }

        public void decrement() {
            val--;
        }

        public int getVal() {
            return val;
        }
    }
}
