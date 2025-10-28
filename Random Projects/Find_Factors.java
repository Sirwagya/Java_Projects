import java.util.*;
public class Find_Factors {
	public static void main(String[] args) {
		Scanner vst = new Scanner(System.in);
		int units = vst.nextInt();
		int price = 4 ;
		int price1 = 5;
		int price2 = 6;

		if (units <= 100){
			System.out.println(units*price);
		}else if (units >100 || units <=300){
			System.out.println((100*price)+((units-100)*price1));

		}else if (units >300){
			System.out.println((100*price)+(200*price1)+((units-300)*price2));
		}
	}
}