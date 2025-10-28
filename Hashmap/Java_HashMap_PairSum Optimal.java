import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int num = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) a[i] = s.nextInt();
        if (check_pair(num, a)) System.out.print("Y");
        else System.out.print("N");
    }
    public static boolean check_pair(int num, int[] a) {
        HashMap<Integer, Integer> h = new HashMap<>();
        
        for (int i : a) {
            if (!h.containsKey(i)) {
                h.put(i, 1);
            } else {
                int temp = h.get(i);
                h.put(i, temp + 1);
            }
        }
        for (int i : a) {
            int y = num - i;
            if (h.containsKey(y)) {
                if (y != i || h.get(i) > 1) {       
                    return true;
                }
            }
        }
        
        return false;
    }
}
