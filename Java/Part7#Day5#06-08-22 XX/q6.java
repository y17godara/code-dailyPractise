// Q- A Student is Pass or Not.

import java.util.Scanner;

public class q6 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Your Marks ");
        float marks = myObj.nextFloat();

        if(marks>=33) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

    }
    
}
