// import java.util.*;

public class q5Largest {

    //Get Largest in Array Function
    public static void getlargestArray(int numbers[]){
        
        int largest = Integer.MIN_VALUE; // -infinity

        for(int i=0; i<numbers.length; i++){ //loop

            if(largest < numbers[i]){ //compairing largest with array
                largest = numbers[i]; //if array is largest so swap value
            }
        }

        System.out.println("The Largest in Arrays is : ");
        System.out.println(largest); //output
    }

    //Main
    public static void main(String args[]){

        int numbers[] = {1, 2, 10, 3, 5}; //arrays created
        getlargestArray(numbers); //function called

    }
    
}
