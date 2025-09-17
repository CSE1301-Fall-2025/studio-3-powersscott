import java.util.Scanner;

public class Sieve {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a positive integer:" );
        int n = in.nextInt();

        boolean [] A = new boolean[n];
        for (int j = 0; j < A.length; j++) {
            boolean t = true;
            A[j] = t;
        }
        
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (A[i] == true) {
                for (int k = (i*i); k < n; k+=i) {
                    A[k] = false;
                }
            }
        }
        for (int x = 2; x < A.length; x++) {
            System.out.println(x + " is " + A[x]);
        }
                

            
            
        

    }
}
