/**
 * @author Qusay H. Mahmoud
 */

import java.io.*;

public class MyThread extends Thread {
   MyThread(String s) {
     super(s);
   }

   public void run() {
     for(int i=0;i<3;i++) {
       System.out.println(getName()+ ": "+i);
       try {
         Thread.sleep(500);
       } catch(InterruptedException e) {
       }
     }
   }

   public static void main(String argv[]) {
     MyThread t1 = new MyThread("Thread 1");
     MyThread t2 = new MyThread("Thread 2");
     t1.start();
     t2.start();
   }
}

