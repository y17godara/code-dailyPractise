// import java.util.*;

public class q8Reverse {

    //Reverse of Array -Function
    public static void reverseArrays(int nums[]){
        int first = 0, last = nums.length-1;

        while(first < last){

            // int temp; //temp number store variable.

            //swaping
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;

            first++;
            last--;

        }
    }

    //Main
    public static void main(String args[]){
        
        int nums[] = {2, 4, 6, 8, 10}; //array created

        reverseArrays(nums); //function called

        for(int i=0; i<nums.length; i++){ //loop

            System.out.print(nums[i] +" "); //printing reverse
        }
        System.out.println();

    } 
    
}
