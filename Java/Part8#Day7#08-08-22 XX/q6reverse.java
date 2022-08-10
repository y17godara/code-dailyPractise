// Q- reverse number n=10899
/*
   HINT
 * get last digit > num%10
 * remove last digit >  num/10

 */

import java.util.Scanner; // sc import

public class q6reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); // sc start

        int n = 10899; // no . to reverse


        for(int i = 0; n> 0; i++){
            int lastdigit = n%10; //get last digit as lastdigit
            System.out.print(lastdigit+ " "); //print
            n /= 10;  // remove last digit
        }
        sc.close(); //sc close
    }
    
}
