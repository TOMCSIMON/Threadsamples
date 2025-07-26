package RunnableSample;

public class NewRunnable implements Runnable {

    @Override
    public void run() {
    System.out.println("Thread " + Thread.currentThread().getName() + "is running");
    }
}
