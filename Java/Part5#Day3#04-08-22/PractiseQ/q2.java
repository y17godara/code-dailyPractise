// Q-  In a program, input the side of a square. You have to output the area of the square.

import java.util.Scanner;

public class q2 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Side of Square ");
        float side = myObj.nextFloat(); // input side of square

        float area = (float) (side * side);
        System.out.println("Area of Given Square "+ area);

    }
    
}
