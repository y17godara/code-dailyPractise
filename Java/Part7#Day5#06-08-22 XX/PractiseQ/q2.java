package PractiseQ;

import java.util.Scanner;

public class q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // double temp = 103.5;
        double temp = sc.nextDouble();

        if(temp>100){
            System.out.println("Fever");
        }else{
            System.out.println("Not Fever");
        }

    }
}
