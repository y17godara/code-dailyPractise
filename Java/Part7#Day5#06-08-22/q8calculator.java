
import java.util.Scanner;

public class q8calculator {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Num1 ");
        int num1 = myObj.nextInt(); 
        System.out.println("Enter Num2 ");
        int num2 = myObj.nextInt();

        char operator = myObj.next().charAt(0);


        switch(operator){
            case '+': System.out.println("Add"+ (num1+num2));
            case '-': System.out.println("Subtract"+ (num1-num2));
            default: System.out.println("fault");
        }

        myObj.close();

    }  
    
}

