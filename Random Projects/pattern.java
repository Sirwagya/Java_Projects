import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner vst = new Scanner(System.in);
        int num = vst.nextInt();
        for (int i = 1; i <= num; i++) {
            
            for (int s = 1; s <= num - i; s++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}