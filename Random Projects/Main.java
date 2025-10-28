import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int countA = 0, countB = 0;

            
            char prev = ' ';
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c != prev) {
                    if (c == 'a') countA++;
                    else countB++;
                    prev = c;
                }
            }

            
            if (countA < countB) {
                System.out.println(countA);
            } else {
                System.out.println(countB);
            }
        }
        sc.close();
    }
}
