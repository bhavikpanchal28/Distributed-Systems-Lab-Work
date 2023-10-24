/**
 * @author Qusay H. Mahmoud
 */

import java.io.*;

/**
 * If a class needs to extend another class then it won't be able to
 * extend the Thread class as Java doesn't support multiple inheritance.
 * The solutiont to this is to implement the Runnable interface which
 * defines one method run(). So you basically provide implementation for
 * run().
 */

public class MyThread2 implements Runnable {
   public void run() {
     for(int i=0;i<3;i++) {
       System.out.println(Thread.currentThread().getName() + ":" +i);
       try {
         Thread.sleep(500);
       } catch(InterruptedException e) {
         e.printStackTrace();
       }
     }
   }

   public static void main(String argv[]) {
      MyThread2 t1 = new MyThread2();
      MyThread2 t2 = new MyThread2();
      Thread ReadFromSocket = new Thread(t1);
      Thread ReadFromKeyboard = new Thread(t2);
      ReadFromSocket.start();
      ReadFromKeyboard.start();
   }
}

