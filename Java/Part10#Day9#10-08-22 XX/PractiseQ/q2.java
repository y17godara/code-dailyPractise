// Q- WriteamethodnamedisEventhatacceptsanintargument.Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod
package PractiseQ;

import java.util.*;

public class q2 {

//Function isEven
public static boolean isEven(int n){
    if(n%2 == 0){
        return true;
    }
    else{
        return false;
    }

}
//Main
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n ");
        int n = sc.nextInt();

        boolean ans = isEven(n);
        System.out.println(ans);


        sc.close();
    }
    
}
