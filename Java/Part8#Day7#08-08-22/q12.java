//q- continue statement- display all no. by user except multiple of 10

import java.util.Scanner; // imported Scanner sc

public class q12 {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in); // scanner sc

        do{
            System.out.println("Enter Your Num ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                System.out.println("Skipped");
                continue;
            }
            System.out.println(n);

        }while(true);


    }
    
}
