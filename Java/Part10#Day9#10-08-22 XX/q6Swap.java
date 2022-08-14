// swap value of a and b;
import java.util.*;

public class q6Swap {
    // public static int valueSwap(int num1, int num2) {
    //     //body
    // }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b, temp;

        System.out.println("Enter Value of \'a\' ");
        a = sc.nextInt();
        System.out.println("Enter Value of \'b\' ");
        b = sc.nextInt();

        System.out.println("Now your Values of \'a\' and \'b\' will Swap.. ");

        temp = a;
        a = b;
        b = temp;

        System.out.println("value of \'a\' "+ a);
        System.out.println("value of \'b\' "+ b);

        sc.close();
    }
}
