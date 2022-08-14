// Q- check if  num is prime or not

import java.util.*; // imported Scanner sc


public class q13optimise {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in); // scanner sc

        System.out.println("Enter Num ");
        int n=sc.nextInt();

        if(n==2){
            System.out.println("Prime");

        }else{
            boolean iPrime = true;

            for(int i=2; i<=Math.sqrt(n); i++) { //OPTIMIZE Math.sqrt(n)
                if(n%i == 0){ // n is a multiple of i (i not equal to 1 or n)
                    iPrime = false;
                }
            }
            if(iPrime == true) {
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }
        
        sc.close(); // sc close

    }
    
}
