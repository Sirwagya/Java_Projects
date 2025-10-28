import java.util.*;

public class pascals_triangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();  

            for (int i = 0; i < n; i++) {
                
                for (int space = 0; space < n - i - 1; space++) {
                    System.out.print("   "); 
                }

                
                for (int j = 0; j <= i; j++) {
                    System.out.print(calculate_nCr(i, j) + "   "); 
                }
                System.out.println();
            }
        }
    }

    public static int calculate_nCr(int n, int r) {
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    
}
