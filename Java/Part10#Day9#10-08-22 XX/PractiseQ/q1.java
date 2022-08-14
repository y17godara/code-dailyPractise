package PractiseQ;

import java.util.*;

public class q1 {

//FUNCTION - Average of Number     
public static float numAvg(float x, float y, float z){

    float sum = x+y+z;
    float avg = sum/3;

    return avg;
}

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a ");
    float a = sc.nextFloat();

    System.out.println("Enter b ");
    float b = sc.nextFloat();

    System.out.println("Enter c ");
    float c = sc.nextFloat();

    float sum = numAvg(a, b, c); //function call

    System.out.println("Average is "+ sum); //output

    sc.close();
}
    
}
