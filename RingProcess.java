import java.io.*;
import java.util.Scanner;
 
public class RingProcess {
    
     public static void main(String args[])throws IOException {
	int i,j,k,l,m,n;
	int pro[] = new int[100];
		
	System.out.print("Enter the number of processes: ");
	Scanner in = new Scanner(System.in);
        n = in.nextInt(); 
        
        for(i=1;i<=n;i++) {
            System.out.println("For process "+i+"...");
            System.out.print("Process id (1, 2, 3, .., n): ");
            pro[i] = in.nextInt();
        }
         
        System.out.print("Which process will initiate election? ");
        
	// TO DO Task: Implement your logic to perform the ring algorithm. 
	// You can initiate a new method or implement your logic in the main method.
		
    }

}
     