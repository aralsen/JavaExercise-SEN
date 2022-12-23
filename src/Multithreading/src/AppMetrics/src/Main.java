import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Metrics metrics = new Metrics();

        bLogic bLogicThread1 = new bLogic(metrics);
        bLogic bLogicThread2 = new bLogic(metrics);

        MetricsPrinter metricsPrinter = new MetricsPrinter(metrics);

        bLogicThread1.start();
        bLogicThread2.start();
        metricsPrinter.start();
    }

    public static class MetricsPrinter extends Thread {
        private Metrics metrics;

        public MetricsPrinter(Metrics metrics) {
            this.metrics = metrics;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }

                double currentAverage = metrics.getAverage();

                System.out.println("Current Average is " + currentAverage);
            }
        }
    }

    public static class bLogic extends Thread {
        private Metrics metrics;
        private Random rnd = new Random();

        public bLogic(Metrics metrics) {
            this.metrics = metrics;
        }

        @Override
        public void run() {
            while (true) {
                long start = System.currentTimeMillis();

                try {
                    Thread.sleep(rnd.nextInt(2));
                } catch (InterruptedException ignored) {
                }

                long end = System.currentTimeMillis();

                metrics.addSample(end - start);
            }
        }
    }

    public static class Metrics {
        private long count = 0;
        private volatile double average = 0.0; // atomic provides atomic1 and atomic2

        public synchronized void addSample(long sample) {
            double currentSum = average * count;
            count++;
            average = (currentSum + sample) / count; // atomic1
        }

        public double getAverage() {
            return average;
        } // atomic2
    }
}
