package PractiseQ;

import java.util.*;

public class q3 {

//Function -isPalindrome   
public static boolean isPalindrome(int number){

    int palindrome = number; //copied number into variable.
    int revenge = 0;

    while(palindrome != 0){
        int reminder = palindrome%10;
        revenge = revenge*10 + reminder;
        palindrome = palindrome/10;
    }
    //if original and the reverse of number is equal means number is Palindrome.

    if(number == revenge){
        System.out.println("True");
        return true;

    }
    return false; //if not palindrome
    
} 

//Main
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n ");
        int n = sc.nextInt();

        // isPalindrome(n);

        if(isPalindrome(n)) {
            System.out.println("Number : "+n+" is a palindrome");
        }else{
            System.out.println("Number : "+n+" is not a palindrome");
        }
        

        

        sc.close();
    }
    
}
