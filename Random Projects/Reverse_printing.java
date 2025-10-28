import java.util.*;

public class Reverse_printing {
    public static void main(String[] args) {
        Scanner vst = new Scanner(System.in);
        int x = vst.nextInt();
        int f = 1;
        int y = 10;
        String num = "";
        int num1 = 0;
        

        if (x >= 10) {
            for (; x >= f; f = f * 10, y = y * 10) {
                int z = (x % y) / f;
                String str = z + "" ;
                num = num + str;
                num1 = Integer.parseInt(num);

            }
            if (num1 == x) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        } else {
            System.out.println(false);
        }
        
        
    }
}