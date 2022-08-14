// convert from binary to decimal no.{101}

import java.util.*;

public class q14binTOdec {

// Binary to Decimal Function    
public static void binaryConv(int binNum){
    int pow = 0;
    int deciNum = 0;

    while(binNum > 0){ //while loop
        int lastdigit = binNum % 10;
        deciNum = lastdigit +(lastdigit*(int)Math.pow(2, pow));

        pow++;
        binNum /= 10; 
    }

    System.out.println("Decimal is "+ deciNum);  
}    

//Main
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number in Binary ");
        int num = sc.nextInt();

        binaryConv(num); // calling function
         
        sc.close();
    }
}
