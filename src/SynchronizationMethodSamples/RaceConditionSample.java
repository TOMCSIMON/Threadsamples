package SynchronizationMethodSamples;

// To prevent race conditions when multiple threads access shared data.
// Ensures that only one thread can access a critical section at a time.
// synchronized keyword on methods or blocks

public class RaceConditionSample {
    public static void main(String[] args){
        Counter cont = new Counter();

        Thread tr1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                cont.increment();
            }
        });

        Thread tr2 = new Thread(() -> {
            for(int i =0; i < 1000; i++) {
                cont.increment();
            }
        });

        tr1.start();
        tr2.start();

        try{
            tr1.join();
            tr2.join();
        }catch(InterruptedException e) {
            System.out.println("Error");
        }

    System.out.println("Final count (Expected: 2000) : " + cont.count);
  }
}
