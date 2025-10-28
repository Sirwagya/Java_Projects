import java.util.*;

public class BI {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String n = s.nextLine();
        long decimal = 0;
        int len = n.length();

        for (int i = 0; i < len; i++) {
            char c = n.charAt(len - 1 - i);
            if (c == '1') {
                decimal += (long)Math.pow(2, i);
            }
        }
        System.out.println("Decimal: " + decimal);
    }
}
            
        
        

