package RunnableSample;

public class RunnableExample {
    public static void main(String[] args){

        NewRunnable newRunnable1 = new NewRunnable();
        NewRunnable newRunnable2 = new NewRunnable();

       Thread tr1 = new Thread(newRunnable1);
       Thread tr2 = new Thread(newRunnable2);

       tr1.setName("A");
       tr2.setName("B");

       tr1.start();
       tr2.start();
    }
}
