import java.util.Random;

// Deadlock: A situation where two or more threads are blocked forever, waiting for each other.

public class Main {
    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        Thread carAThread = new Thread(new CarA(intersection));
        Thread carBThread = new Thread(new CarB(intersection));

        carAThread.start();
        carBThread.start();
    }

    public static class CarB implements Runnable {
        private Intersection intersection;
        private Random random = new Random();

        public CarB(Intersection intersection) {
            this.intersection = intersection;
        }

        @Override
        public void run() {
            while (true) {
                long sleepingTime = random.nextInt(5);
                try {
                    Thread.sleep(sleepingTime);
                } catch (InterruptedException e) {
                }

                intersection.takeRoadB();
            }
        }
    }

    public static class CarA implements Runnable {
        private Intersection intersection;
        private Random random = new Random();

        public CarA(Intersection intersection) {
            this.intersection = intersection;
        }

        @Override
        public void run() {
            while (true) {
                long sleepingTime = random.nextInt(5);
                try {
                    Thread.sleep(sleepingTime);
                } catch (InterruptedException e) {
                }

                intersection.takeRoadA();
            }
        }
    }

    public static class Intersection {
        private Object roadA = new Object();
        private Object roadB = new Object();

        public void takeRoadA() {
            synchronized (roadA) {
                System.out.println("Road A is locked by thread " + Thread.currentThread().getName());

                synchronized (roadB) {
                    System.out.println("Car is passing through road A");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }

        public void takeRoadB() {
            synchronized (roadB) { // If u want to solve the deadlock, just change the order of the locks
                // change roadB to the roadA above
                System.out.println("Road B is locked by thread " + Thread.currentThread().getName()); // Deadlock
                //System.out.println("Road A is locked by thread " + Thread.currentThread().getName());

                synchronized (roadA) {
                    System.out.println("Car is passing through road B");

                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}
