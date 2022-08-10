package PractiseQ;

import java.util.*;

public class q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        int sumEven = 0;
        int sumOdd = 0;
        int choice;
        
        do{
            System.out.println("Enter your Num ");
            n = sc.nextInt();

            if(n % 2 == 0){
                System.out.println("even entered");
                sumEven += n;
            }else{
                System.out.println("odd entered");
                sumOdd += n;
            }

            System.out.println("Do you wanna continue, 1 yes / 0 no ");
            choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("Total Sum of Even "+ sumEven);
        System.out.println("Total Sum of Odd "+ sumOdd);


        sc.close();
    }
    
}
