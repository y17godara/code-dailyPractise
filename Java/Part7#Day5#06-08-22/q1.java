// Q1- largest  of 2 number
import java.util.Scanner;

public class q1 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Num1 ");
        int num1 = myObj.nextInt();
        System.out.println("Enter Num2 ");
        int num2 = myObj.nextInt();

        if(num1==num2) {
            System.out.println("Numbers are Equal");
        }
        else if(num1<num2) {
            System.out.println("Number "+num2 +" is Larger");
        }
        else {
            System.out.println("Number "+num1 +" is Larger");
        }

        
    }
    
}
