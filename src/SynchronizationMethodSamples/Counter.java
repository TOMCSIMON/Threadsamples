package SynchronizationMethodSamples;

public class Counter {

    int count = 0;

    // synchronized method sample
    public synchronized void increment() {
        count++;
    }
}
