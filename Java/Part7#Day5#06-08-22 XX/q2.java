// Q2- Print Number is Odd or Even

import java.util.Scanner;

public class q2 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your Number ");
        int num = myObj.nextInt();

        if(num%2 == 0) {
            System.out.println("Number "+ num +" is Even");
        } else {
            System.out.println("Number "+ num +" is Odd");
        }

    }
    
}
