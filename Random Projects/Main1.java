import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print left side numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            if (i == n) {
                // Middle row - concatenate directly
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
            } else {
                // Print spaces - need 2*(n-i) spaces for proper alignment
                for (int k = 0; k < 2 * (n - i); k++) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        
        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print left side numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Print spaces - need 2*(n-i) spaces
            for (int k = 0; k < 2 * (n - i); k++) {
                System.out.print(" ");
            }
            
            // Print right side numbers from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
