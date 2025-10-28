import java.util.*;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt(); // You can change this value as needed
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 2 * rows - 1; i++) {
            if (i < rows / 2) {
                sb.append('*');
                sb.append(' ');
                for (int j = 0; j < i; j++) {
                    sb.append(' ');
                }
                sb.append('*');
            } else {
                sb.append(' ');
                if (i == rows / 2) {
                    sb.append(""); // Middle line
                }
            }
            
            System.out.println(sb.toString());
        }
    }
}
