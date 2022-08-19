// import java.util.*;

public class q6Smallest {

    //Get Smallest in Arrays Function
    public static void getSmallestArray(int marks[]){
        
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<marks.length; i++){ //loop

            if(smallest > marks[i]){ //compairing
                smallest = marks[i]; //marks[] with smallest
            }
        }
        System.out.println("Smallest of Arrays :");
        System.out.println(smallest); //output
    }

    //Main
    public static void main(String args[]){
        
        int marks[] = {93, 50, 56, 98, 11}; //arrays created

        getSmallestArray(marks); //function called
    }
    
}
