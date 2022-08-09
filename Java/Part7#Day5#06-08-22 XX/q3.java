//Q3- Income tax calculator

import java.util.Scanner;

public class q3 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Your Annual Income ");
        float inc = myObj.nextFloat();
        float tax=0;

        if(inc < 500000) {
            System.out.println(tax);
        }
        else if(inc >= 500000 && inc < 1000000) {
            System.out.println(inc * 0.2);
        }
        else {
            System.out.println(inc * 0.3);
        }

    }
    
}
