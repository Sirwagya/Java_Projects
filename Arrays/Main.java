import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int size = s.nextInt();
		int[] a = new int [size];
		for (int i = 0 ; i <a.length ; i++)a[i]=s.nextInt();
		good_element (a);
		
	}
	public static void good_element (int[]a){
		int count = 0 ;
		HashMap<Integer,Integer> h = new HashMap <>();
		for (int i : a){
			if (!h.containsKey(i))h.put(i,1);
			else {
				int temp = h.get(i);
				h.put (i,temp+1);
			}
		}
		Set<Integer> keys = h.keySet();
		for (int i : keys){
			if (i >= h.get(i)) count ++;
		}
		System.out.print(count);
	}
	
}
