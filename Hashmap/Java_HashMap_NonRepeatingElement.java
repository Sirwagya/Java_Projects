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
        HashMap<Integer, Integer> h = new HashMap<>();

     
        for (int i : a) {
            if (!h.containsKey(i)) {
                h.put(i, 1);
            } else {
                int temp = h.get(i); 
                h.put(i, temp + 1);  
            }
        }

        //System.out.println(h); 

        
        for (int i : a) {
            if (h.get(i) == 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
