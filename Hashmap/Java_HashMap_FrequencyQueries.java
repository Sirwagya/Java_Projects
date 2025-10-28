import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int size = s.nextInt();
		int queries = s.nextInt();
		int [] a = new int [size];
		for (int i = 0 ; i < a.length; i++)a[i]=s.nextInt();
		HashMap <Integer , Integer> h = new HashMap<>();
		for (int i : a){
			if (!h.containsKey(i)){
				h.put(i, 1);
			}
			else {
				int temp = h.get(i);
				h.put (i , temp+1);
			}
		}
		while (queries-- > 0) {
            int key = s.nextInt();
            Integer count = h.get(key);
            if (count == null) {
              System.out.println(0);
            } 
			else {
             System.out.println(count);
            }
        }
	}
}