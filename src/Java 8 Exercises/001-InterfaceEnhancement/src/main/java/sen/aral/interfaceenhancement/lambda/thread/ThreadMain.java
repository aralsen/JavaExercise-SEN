package sen.aral.interfaceenhancement.lambda.thread;

public class ThreadMain {
    public static void main(String[] args)
    {
        Runnable runnable = new ThreadEx();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        /* The above code is just an example to how we can implement the Runnable interface
        * ThreadEx class is unnecessary because of the implementation I wrote according to the code below */

        Thread thread2  = new Thread(() -> {
            for (int count = 1; count <= 5; count++) {
                System.out.println("In CHILD2 THREAD, Counter value is " + count);
            }
        });

        thread2.start();

        for (int count = 1; count <= 5; count++) {
            System.out.println("In MAIN THREAD, Counter value is " + count);
        }
    }
}