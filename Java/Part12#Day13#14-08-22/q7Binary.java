import java.util.*;

public class q7Binary {

    //Binary Search Function
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = (numbers.length)- 1; 

            while(start <= end){
               int mid =  (start+end) / 2;

               //comairison
               if(numbers[mid] == key){ //key found at mid
                return mid;
               }
               if(numbers[mid] < key){ //right
                start = mid+1;
               }
               else{ //left
                end = mid-1;
               }
            }
            return -1; //if key not found in given arrays
    }

    //Main
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //scanner object
        
        int numbers[] = {2, 4, 6, 8, 10, 12, 14}; //array created

        System.out.println("Enter Key : ");
        int key = sc.nextInt(); //key read

        System.out.println("Index for "+ key +" is " + binarySearch(numbers, key)); //function called + index printing

        sc.close(); //Scanner close
    }
}
