//
import java.util.*;

public class q4 {


    public static int cal(int x, int y, int z){
        int mult = x*y*z;
        return mult;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        int a, b, c, total;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        
        total = cal(a, b, c);
        System.out.println(total);

        sc.close();
    }
}
