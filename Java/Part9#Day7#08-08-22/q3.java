
import java.util.Scanner; // imported Scanner sc

public class q3 {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in); // scanner sc

        System.out.println("Enter Max ");
        int max = sc.nextInt();

        for(int i = 1; i<=max; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close(); // sc close

    }
    
}
