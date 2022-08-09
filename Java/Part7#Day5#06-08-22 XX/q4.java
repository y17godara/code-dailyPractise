// Q- Largest of Three Numbers

import java.util.Scanner;

public class q4 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        //Users Input
        System.out.println("Enter Your Num ");
        int a = myObj.nextInt();
        System.out.println("Enter Your Num ");
        int b = myObj.nextInt();
        System.out.println("Enter Your Num ");
        int c = myObj.nextInt();

        if((a>=b) && (a>=c)) {
            System.out.println("A is Largest");
        }else if(b>=c) {
            System.out.println("B is Largest");
        }else{
            System.out.println("C is Largest");
        }
        
    }    
}
