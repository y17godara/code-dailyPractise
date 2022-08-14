// Binomial Coefficient Calculator

/*
a binomial coefficient is indexed by a pair of integers n ≥ k ≥ 0 and is written {\displaystyle {\tbinom {n}{k}}.}
*/
import java.util.*;

public class q9 {
    
//Helper Function
public static int printFactorial(int n){
    int f = 1; //factorial

    for(int i = 2; i <=(n); i++){
        f = f*i;
    }
    // System.out.println(f); // return/print value of f - factorial
    return f; // return f
}

//Function for Binomial Coefficients

public static int printformula(int n, int r){
    int fact_n = printFactorial(n);
    int fact_r = printFactorial(r);
    int fact_nmr = printFactorial(n-r);

    int fact_c = fact_n / (fact_r*fact_nmr);

    return fact_c;
}
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter x/y ");
        int x = sc.nextInt(); //inputs
        int y = sc.nextInt();

        
        System.out.println(printformula(x, y)); // calling and printing 
       
        sc.close();
    }
}
