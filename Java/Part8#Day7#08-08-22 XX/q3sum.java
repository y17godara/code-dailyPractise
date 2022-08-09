//Q- sum of first n natural no.s

import java.util.Scanner;

public class q3sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
   
        System.out.println("enter n ");
        int n = sc.nextInt();

        int count = 1;
        int sum = 0;

        while(count <= n){
            sum += count; // sum = sum + count;
            count++;
        }

        System.out.println("Sum is "+ sum); //output 

        sc.close();
    }
    
}
