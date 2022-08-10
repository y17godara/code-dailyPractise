//  DO while loop

import java.util.Scanner; // imported Scanner sc

public class q8doWhile {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in); // scanner sc

        //Syntax
        // do{ 
        //     //do something
        // }while(condition);

        int count = 1;

        do{ 
            System.out.println("Hello");
            count++;
        }while (count <= 10);

        sc.close(); // sc close
    }
    
}
