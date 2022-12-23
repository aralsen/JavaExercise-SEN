public class Main {
    public static void main(String[] args) {
        SharedResourcesClass sharedClass = new SharedResourcesClass();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                sharedClass.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                sharedClass.checkForDataRace();
            }

        });

        thread1.start();
        thread2.start();
    }

    public static class SharedResourcesClass {
        private int val1 = 0;
        private int val2 = 0;

        public void increment() {
            val1++;
            val2++;
        }

        public void checkForDataRace() {
            if (val2 > val1)
                System.out.println("y > x - Data Race happened!!!");
        }
    }
}
