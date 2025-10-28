import java.util.*;

public class Largest_Number {
	public static void main(String[] args) {
		Scanner vst = new Scanner(System.in);
		int num = vst.nextInt();
		int num_1 = vst.nextInt();
		int num_2 = vst.nextInt();

		if (num>num_1 || num > num_2){
			System.out.print(num);
		}else if (num_1 > num_2){
			System.out.print(num_1);
		}else {
			System.out.print(num_2);
		}
	}
}