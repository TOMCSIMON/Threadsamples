package ThreadPractices;

public class Sample1  {
  public static void main(String[] args) {

    MyThread myThread1 = new MyThread();
    MyThread myThread2 = new MyThread();

    myThread1.setName("A");
    myThread2.setName("B");

    myThread1.start();
    myThread2.start();

    try {
      myThread1.join();
      myThread2.join();
    } catch (InterruptedException e) {
      System.out.println("Error");
    }

    System.out.println("Main Thread Finished");
  }
}
