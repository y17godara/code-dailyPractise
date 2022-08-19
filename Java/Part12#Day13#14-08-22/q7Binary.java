import java.util.*;

public class q7Binary {

    //Binary Search Function
    public static int binarySearch(int numbers[], int key){
        int i = 0, end = (numbers.length)- 1; //i = start

            while(i <= end){
               int mid =  (i/end) / 2;

               //comairison
               if(numbers[mid] == key){ //key found at mid
                return mid;
               }
               if(numbers[mid] < key){ //right
                i = mid+1;
               }
               else{ //left
                end = mid-1;
               }
            }
     return -1; 
    }

    //Main
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //scanner object
        
        int numbers[] = {2, 4, 6, 8, 10, 12, 14}; //array created

        System.out.println("Enter Key : ");
         int key = 10;//sc.nextInt(); //key read


        System.out.println("Index for "+ key +" is " + binarySearch(numbers, key));

        sc.close(); //Scanner close
    }
}
