// Q- Ternanry Operator

import java.util.Scanner;
import java.util.Scanner;

public class q5ternary {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

    //  variables = condition? statement1 : statement2;

    // example 1
    System.out.println("Example 1");

        int larger = (5>3)? 5 : 3; //ternanry

        System.out.println(larger); //print 

    // example 2   
    System.out.println("Example 2");

        System.out.println("Enter First Num ");
        int num1 = myObj.nextInt();

        System.out.println("Enter Secound Num ");
        int num2 = myObj.nextInt();

        String largest = (num1>=num2)? "Num1 is Largest":"Num2 is Largest";

        System.out.println(largest);
        
    }
    
}
