package extraWork;
import java.util.Scanner;

public class q8 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");
        int input = myObj.nextInt();
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;


        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);

    
    }
    
}
