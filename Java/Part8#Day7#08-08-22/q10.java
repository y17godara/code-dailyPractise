//Q- keep enterning till user enters a multiple of 10 and break

import java.util.Scanner; // imported Scanner sc
public class q10 {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in); // scanner sc

        do{
            System.out.println("enter your num ");
            int n = sc.nextInt();
            if(n%10 == 0){
                System.out.println("Alert! you entered x10 ");
                break;
            }
            System.out.println(n);
        }while(true);


        sc.close(); // sc close

    }
    
}

