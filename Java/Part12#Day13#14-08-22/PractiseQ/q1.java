//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
package PractiseQ;
import java.util.*;

public class q1 {

    //Function
    public static boolean twiceNum(int nums[]){

        for(int i=0; i<nums.length-1; i++){ //loop

            for(int j=i+1; j<nums.length; j++){ //loop2 -nested loop

                if( nums[i] == nums[j] ){ //comparision

                    return true; //TRUE

                }
            }
        }

        return false; //FALSE
    }

    //Main
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); //scanner object

        //array assigned
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        
        // System.out.println(twiceNum(nums));

        if(twiceNum(nums) == true){
            System.out.println("True: Value Appears at least Twice.");
        }
        else{
            System.out.println("False: Every value is distinct.");
        }


        sc.close(); //scanner object closed
    }
    
}
