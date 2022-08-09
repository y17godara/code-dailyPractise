//Q- print counting from 1 to 10 with while loop

import java.util.Scanner;

public class q2num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        int max = 10; // we can put max as input from user

        while(count <= max){
            System.out.print(count+ " ");
            count++;
        }

        sc.close(); //sc close    
    }

}