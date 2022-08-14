//Q- print "hello" x10 time with WHILE LOOP
import java.util.Scanner;

public class q1while {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

       //while Loop
       int count = 0;
       System.out.println("Max Counts");
       int max = sc.nextInt();

       while(count<max){
        System.out.println("Hello");
        count++; //count value increases by +1.
       }
       System.out.println("Printed Hello 10x times");

       sc.close(); //sc ends
    }
    
}
