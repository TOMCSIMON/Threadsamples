package ThreadPractices;

public class MyThread extends Thread{

  @Override
  public void run() {
    System.out.println("Thread " + getName() + " is Running...");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("Error occurred!");
    }

    System.out.println("Thread " + getName() + " is Finished");
  }
}
