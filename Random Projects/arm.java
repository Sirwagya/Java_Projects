import java.util.*;

public class arm {
    public static void main(String[] args) {
        Scanner vst = new Scanner(System.in);
        int num = vst.nextInt();
        int power = 0;
        int t = num ;
        while(t!=0){
            t/=10;
            power++;
            
        }
        if (num>0){
            int arm = 0;
            int temp = num;
            while (temp!=0){
                int x = temp%10;
                arm +=Math.pow(x,power);
                temp/=10;


            }if (num==arm){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }else if (num==0){
            System.err.println("Yes");
        }else{
            System.err.println("No");
        }

    }
}