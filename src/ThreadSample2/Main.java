package ThreadSample2;

public class Main {
  public static void main(String[] args) {

    // MultiThreading = Enables a program to run multiple threads concurrently
    //                  (Thread = A set of instructions that ruu independently)
    //                  Useful for a background task or time-consuming operations

    Thread thread1 = new Thread(new MyRunnable("PING"));
    Thread thread2 = new Thread(new MyRunnable("PONG"));

    System.out.println("GAME START...");

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    }
    catch (InterruptedException e) {
      System.out.println("Main thread was interrupted");
    }

    System.out.println("GAME OVER!!");
  }
}
