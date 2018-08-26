package practice;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class ApostekNearestElement{
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 */
      
       
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();                 // Reading input from STDIN
        int q = s.nextInt();
        s.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int i;
        while (q > 0) {
        	int query = s.nextInt();
            int index = s.nextInt();
            if (query == 0) {
            	 if (index-1 < 0){
                 	System.out.print(-1);
                 }
                for (i = index-1; i >= 0; i--) {
                	if (arr[i] == 1) {
                        System.out.print(i);
                        break;
                    } else if(i==0){
                        System.out.print(" "+ -1); 
                    }
                }
                if (index+1 > n) {
            		System.out.println(" "+ -1);
            		continue;
            	}
                for (i = index + 1; i < n; i++) {
                    if (arr[i] == 1) {
                        System.out.print(" "+ i);
                        break;
                    } else if(i == n-1) {
                       System.out.print(" "+ -1);  
                    }
                }
              System.out.println(); 
            } else {
                arr[index] = 1;
            }
            q--;
        }
       

        // Write your code here

    }
}

