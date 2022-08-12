//

import java.util.*;

public class q3 {

    public static void printCal(int num1, int num2) {
        int add = (num1*num2)+20;
        System.out.println(add);
    }     
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Nub ");
        int x = sc.nextInt();
        int y = sc.nextInt(); 
        printCal(x, y);

        sc.close();
    }
}
