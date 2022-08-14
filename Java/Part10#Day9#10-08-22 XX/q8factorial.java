//factorial
import java.util.*;

public class q8factorial {

    public static int printFactorial(int n){

        int f = 1; //factorial

        for(int i = 2; i <=(n); i++){
            f = f*i;
        }
        System.out.println(f); // return/print value of f - factorial
        return 1; // return 1

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("enter value of \'n\' ");
        n = sc.nextInt();

        printFactorial(n); // calling function

        sc.close();
    }
    
}
