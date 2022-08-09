package extraWork;
import java.util.Scanner;

public class q3 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the time-period in minutes \"m\" ");
        float mins = myObj.nextFloat(); // mins input

        long years = (long)(mins / 525960 ); //to calculate years {maths}
        int days = (int)(mins/60/24)%365; //to calculate days {maths}

        System.out.println("Minutes in years "+ (int)years +"and days "+ days);
        
    }
    
}

/*

Write a Java program to convert minutes into a number of years and days
 
*/

