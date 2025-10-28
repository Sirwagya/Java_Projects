import java.util.*;

public class IB {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        long n = s.nextLong();
        String b = "";
        while (n > 0) {
            long r = n % 2;
            b = r + b;
            n = n / 2;
        }
        System.out.println(b);
    }
}
