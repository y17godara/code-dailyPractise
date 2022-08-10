
import java.util.Scanner; // imported Scanner sc

public class q2 {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in); // scanner sc

        System.out.println("Enter Max ");
        int max = sc.nextInt();

        for(int i=1; i<=max; i++){
            
            for(int j=1; j<=(max-i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close(); // sc close
    }
    
}
