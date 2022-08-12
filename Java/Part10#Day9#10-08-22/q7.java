//product of a and b

import java.util.*;

public class q7 {

    public static int multi(int num1, int num2){
        int sum = num1*num2;
        return sum; 
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a,b, sum;

        System.out.println("Enter Input ");
        a = sc.nextInt();
        b = sc.nextInt();

        sum = multi(a, b);
        System.out.print("Output "+ sum);

        sc.close();
    }
    
}
