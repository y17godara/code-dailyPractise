package extraWork;
import java.util.Scanner;

public class q7 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your First Integer{Grater} ");
        int a = myObj.nextInt();

        System.out.println("Enter your Secound Integer{Smaller} ");
        int b = myObj.nextInt();

        System.out.println("Sum "+ (a + b) );
        System.out.println("Difference "+ (a - b) );
        System.out.println("Product "+ (a * b) );
        System.out.println("Average "+ (float)(a+b) / 2 );
        System.out.println("Distance "+ (Math.abs(a - b)) );
        System.out.println("Max Integer "+ (Math.max(a, b)) );
        System.out.println("Min Integer "+ (Math.min(a, b)) );
        
    }
    
}
