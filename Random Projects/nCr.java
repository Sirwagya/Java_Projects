import java.util.*;
public class nCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("nCr of " + n + " and " + r + " is: " + calculate_nCr(n, r));
    }

    public static int calculate_nCr(int n, int r) {
        if (r > n) {
            return 0;
        }
        if (r == 0 || r == n) {
            return 1;
        }
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


