
import java.util.Scanner; // imported Scanner sc

public class q7reverse{
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in); // scanner sc

        int n = 10899;
        int rev = 0;

        while(n>0){
            int lastdigit = n % 10;
            rev = (rev*10) + lastdigit;
            n = n/10;
        }
        System.out.println(rev);


        sc.close(); // sc close

    }
    
}
