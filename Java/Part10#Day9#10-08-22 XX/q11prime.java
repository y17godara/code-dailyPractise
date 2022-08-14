// no. is prime or not

import java.util.*;

public class q11prime {

public static boolean isPrimenum(int n){
    boolean isPrime = true;

    if(n == 2){
        isPrime=true;
        return isPrime;
    }

    for(int i=2; i<=(n-1); i++){
        if(n%i == 0){
            isPrime = false;
            return isPrime;
        }
    }

    return isPrime;
}    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("enter n ");
        n = sc.nextInt();

        System.out.println(isPrimenum(n)); // call and print isPRime
      

        sc.close();
    }
    
}
