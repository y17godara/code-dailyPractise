package extraWork;
import java.util.Scanner;

public class q6 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Number ");
        long var = myObj.nextLong();

        long sq = (var * var);
        long cube = (var * var * var);
        long power4 = (var * var * var * var);

        System.out.println("Square of number "+ sq);
        System.out.println("Square of number "+ cube);
        System.out.println("Square of number "+ power4);

    }
    
}
