// Q- In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.

import java.util.Scanner;

public class q1 {

    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter your Numbers to Calculate Average!");

    int a = myObj.nextInt(); //nums for average
    int b = myObj.nextInt();
    int c = myObj.nextInt();

    int cal = (a + b + c / 3); //cals for average

    System.out.println("Hence Average is "+ cal); //output

    }
  
}
