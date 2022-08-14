// convert from binary to decimal no.{101}

import java.util.*;

public class q14binTOdec {

public static int binaryConv(int num){

    for(int i=1; i<=num;){
        int lastdigit = num % 10;
        int j = lastdigit +(lastdigit*2);
        i++;
        return j;
    }
    return 1;
}    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number in Binary ");
        int num = sc.nextInt();

        binaryConv(num);

        
        sc.close();
    }
}
