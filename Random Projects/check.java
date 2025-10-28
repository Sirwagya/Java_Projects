import java.util.*;
public class check {
    public static void main(String[] args) {
        Scanner vst = new Scanner(System.in);
        int num = vst.nextInt();

        if (num <= 0) {
            System.out.println("Enter a positive number");
            return;
        }

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");       
            
            }
        }
    }
}