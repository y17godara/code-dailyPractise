import java.util.Scanner;

public class q1patternBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num ");
        int max = sc.nextInt();

        for(int i=1; i<=max; i++){
            // one line
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
           System.out.println(); //space for next line
        }

        sc.close();
    }
    
}
