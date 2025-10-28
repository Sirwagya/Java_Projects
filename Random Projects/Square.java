import java.util.*;

public class Square {
	public static void main(String[] args) {
		Scanner v = new Scanner (System.in);
	     
		long sum = 0;
		for (int i = 0 ; i<5 ; i ++){
			long num = v.nextLong();
			sum += num*num;
		}System.out.print(sum);

	}
}