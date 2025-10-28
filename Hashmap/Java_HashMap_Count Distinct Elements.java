import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) a[i] = s.nextInt();
        first_non_repeating_element(a);
    }
    public static void first_non_repeating_element(int[] a) {
        HashSet<Integer> h = new HashSet<>();
        for (int i : a) {
            h.add(i);
        }
		System.out.print(h.size());
    }
}


     

       

        
      
