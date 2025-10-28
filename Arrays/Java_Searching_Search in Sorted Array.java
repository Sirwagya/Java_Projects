import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
    
        int k = s.nextInt();
        int low = 0;
        int high = a.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2; 
            if (a[mid] == k) {
                found = true;
                break;
            } else if (a[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (found) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
        
    }
}
