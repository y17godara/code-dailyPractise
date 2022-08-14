//print all prime in a Range(n)
import java.util.*;

public class q13Pinrange {

//HELPER FUNCTION
public static boolean isPrimenum(int n){
    boolean isPrime = true;
    if(n == 2){
        isPrime=true;
        return isPrime;
    }
    for(int i=2; i<=Math.sqrt(n); i++){ //Optimization = using sqr of n instant of n-1
        if(n%i == 0){
            isPrime = false;
            return isPrime;
        }
    } 
    return isPrime;
}    


//PRIME_RANGE FUNCTION
public static void primeRange(int n){
    for(int i=2; i<=n; i++){

        if( isPrimenum(i) ){  //true

            System.out.print(i+" "); // loop printing

        }  
    }

    System.out.print("\n"); //space

}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter range n ");
        int n = sc.nextInt();

        primeRange(n); //calling Prime-range function

        sc.close();
    }
}
