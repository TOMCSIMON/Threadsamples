package SynchronizationBlockSamples;


public class SynchBlockSample {
    public static void main(String[] args){

        Counter counter =  new Counter();

        Thread tr1 = new Thread(() -> {
            for(int i =0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread tr2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        tr1.start();
        tr2.start();

        try{
            tr1.join();
            tr2.join();
        }catch (InterruptedException e) {
            System.out.println("Error");
        }

    System.out.println("Final count:" + counter.count);
  }
}
