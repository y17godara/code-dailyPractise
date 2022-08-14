//decimalto binary

import java.util.*;

public class q15deciTobin {

//Decimal Function
public static void decimalConv(int n){
    int pow = 0;
    int binNum = 0;


    while(n > 0){ //while loop
        int rem = n % 2;
        binNum = binNum +(rem*(int)Math.pow(10, pow));

        pow++;
        n /= 2; 
    }
    System.out.println("Binary Num "+ binNum); //output

}   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n ");
        int n = sc.nextInt();

        decimalConv(n); // function call

        sc.close();
    }
}
