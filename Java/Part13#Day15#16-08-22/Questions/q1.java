import java.util.Scanner;

public class q1 {

    //Sort
    public static void bubbleSort(int arr[]){

        for(int i=0; i<arr.lenght-1; i++){
            for(int j=0; j<arr.lenght-1-i; j++){

                if(arr[i] > arr[j+1]){
                    //swap
                    int temp = arr[j]; //temp container
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    System.out.println(arr);
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Question 1 [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]
        
        int arr[] = [3, 6, 2, 1, 8, 7, 4, 5, 3, 1];

        bubbleSort(arr);



    }
}