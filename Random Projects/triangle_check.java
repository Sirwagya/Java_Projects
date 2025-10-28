import java.util.*;

public class triangle_check {
    public static void main(String[] args) {
        Scanner vst = new Scanner(System.in);
        int num = vst.nextInt();
        int num_1 = vst.nextInt();
        int num_2 = vst.nextInt();

        
        if (num > 0 && num_1 > 0 && num_2 > 0) {
            
            if (num + num_1 > num_2 && num + num_2 > num_1 && num_1 + num_2 > num) {
                if (num == num_1 && num_1 == num_2) {
                    System.out.print("equilateral triangle");
                } else if (num == num_1 || num == num_2 || num_1 == num_2) {
                    System.out.print("isosceles triangle");
                } else {
                    System.out.print("scalene triangle");
                }
            } else {
                System.out.print("Not a triangle");
            }
        } else {
            System.out.print("Not a triangle");
        }
    }
}