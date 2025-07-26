package SynchronizationBlockSamples;

public class Counter {
  int count = 0;

  //  synchronized block ensures that only one thread can access a specific section of code at a time
  //  to prevent data conflicts.

  Object lock = new Object();

  public void increment() {

    synchronized (lock) {
      count++;
    }
  }
}
