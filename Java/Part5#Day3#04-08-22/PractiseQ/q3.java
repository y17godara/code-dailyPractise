// Q- Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.Scanner;

public class q3 {
    public static void main(String args[]){

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Cost of Pencil ");
        float pencil = myObj.nextFloat();

        System.out.println("Enter Cost of Pen ");
        float pen = myObj.nextFloat();

        System.out.println("Enter Cost of Eraser ");
        float eraser = myObj.nextFloat();

        float totalcost = (float)(pencil + pen + eraser);


        //Add on - with 18% tax
        float gstcost = totalcost + (0.18f * totalcost);

        System.out.println("Total Cost: Taxes included!");
        System.out.println(gstcost);

    }
    
}
