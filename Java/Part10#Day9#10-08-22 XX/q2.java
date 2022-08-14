// Function/Methods - syntax with Parameters

import java.util.Scanner;

public class q2 {

    //Example 
    /*
    returnType name(type parameter1, type parameter2 ) {
        //body
        return statement;
     }
     */

    //function
    public static int numSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    //main
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum2;

        System.out.println("Enter Nums ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        sum2 = numSum(x, y); // function call
        System.out.println(sum2);


        sc.close();
    }
    
}
