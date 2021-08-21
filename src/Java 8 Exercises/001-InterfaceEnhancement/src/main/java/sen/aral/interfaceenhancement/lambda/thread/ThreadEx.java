package sen.aral.interfaceenhancement.lambda.thread;

public class ThreadEx implements Runnable {
    @Override
    public void run()
    {
        for (int count = 1; count <= 5; count++) {
            System.out.println("In CHILD THREAD, Counter value is " + count);
        }
    }
}
