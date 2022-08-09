// Q- Find Area of Circle Input From User

import java.util.Scanner;

public class javaq3 {
    public static void main(String args[]){
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter Radius of Circle ");
    float num = myObj.nextFloat();

    float cal = (float) (num * num * 3.14);

    System.out.println(cal + " is the area of Circle with Radius " + num);


    }
    
}
