//Arrays -Introduction
import java.util.*;

public class q1basics {


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //DEFINITION OF AN ARRYAS
        /*

        List of Element of the Same Type placed in a Contiguos memory location.
        example[] = {1, 2, 3, 4, 5, 6};
        HERE, Indexing Start from 0 

         */

        //OPERATIONS

        /*
        Creation of Arrays->

        dataType arrayName[] = new dataType[size];
        example->
        int marks[] = new int[50];
        int marks[] = {40, 45, 95, 23, 98};
        String fruits[] = {"apple", "mango", "banana"};
          */

        /*
        Input of Arrays->
        example->
        Scanner sc = new Scanner(Sysytem.in);

        int marks[] = new int[50];
        marks[0] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[1] = sc.nextInt();
          */
        
        /*
        Output in Arrays->

        System.out.println("Output is : "+ marks[0]);
        OR
        System.out.println("Output is : "+ marks[]);
           */
        
        /*
        Update in Arrays->
        here,
        marks[2] = sc.nextInt();
        //here hoe to update
        marks[2] = 100; //assignes marks[2] = 100 here
        marks[2] = marks[2] + 1; //another type of updation
         */   

        //LENGHT OF ARRAYS
        /*
        marks.lenght
         */

        sc.close();
    }
    
}
