import java.util.*;

public class marks_grading {
    public static void main(String[] args) {
        Scanner vst = new Scanner(System.in);
        int marks = vst.nextInt();

        if (marks > 90) {
            System.out.print("excellent");
            
        } else if (marks <= 90 && marks > 80) {
            System.out.print("good");

        } else if (marks <= 80 && marks > 70) {
            System.out.print("average");

        } else if (marks <= 70 && marks > 60) {
            System.out.print("below average");
        } else {
            System.out.print("fail");
        }
    }
}
