package PractiseQ;

import java.util.*;

public class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        int fact = 1;

        System.out.println("Enter a Positive number ");
        n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial of "+ n +" is "+ fact);

        sc.close();
    }
    
}
