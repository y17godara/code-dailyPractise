package extraWork;
import java.util.Scanner;

public class q2 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Temperature in C* ");
        float Faha = myObj.nextFloat();

        float cal = (Faha * 1.8f) + 32;

        System.out.println("In Celsius "+ cal);

    }
    
}

/*

 Q- Write a Java program to convert temperature from Fahrenheit to Celsius degree.
 (Input a degree in Fahrenheit: 212
  Expected Output:
  212.0 degree Fahrenheit is equal to 100.0 in Celsius)

 */
