import java.io.*;
import java.util.concurrent.Semaphore;

// Counter shared by multiple threads -- access is not synchronzied

public class MultiCounter extends Thread {

   private static int counter = 0;
   private static final int limit = 10;
   private static Semaphore sem = new Semaphore(1);

   public static void main(String argv[]) throws InterruptedException {
      MultiCounter t1 = new MultiCounter();
      MultiCounter t2 = new MultiCounter();
      MultiCounter t3 = new MultiCounter();

      t1.start();
      t2.start();
      t3.start();

      t1.join();
      t2.join();
      t3.join();
   }

   public void run() {
      while (counter < limit) {
         incrementCounter();
      }
   }

   private void incrementCounter() {
      try {
         sem.acquire();
         System.out.println(Thread.currentThread().getName() + " counter : " + counter);
         counter++;
      } catch (InterruptedException e) {
         e.printStackTrace();
      } finally {
         sem.release();
      }
   }

}
