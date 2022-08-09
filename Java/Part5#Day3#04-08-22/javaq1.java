// Q- Sum of Two Numbers

import java.util.Scanner; // import the Scanner class 

public class javaq1 {

    public static void main(String args[]){
    Scanner myObj = new Scanner(System.in);


    System.out.println("Enter First Number ");
    int num1 = myObj.nextInt(); // num1 input

    System.out.println("Enter Secount Number ");
    int num2 = myObj.nextInt(); // num2 input

    double sum = num1 + num2; // sum: sum of a and b
    System.out.println(sum); 

    System.out.println("Thanks");

    }
    
}
