
public class q1 {

    //Sort
    public static void bubbleSort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){

                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j]; //temp container
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //Function -Array Printing
    public static void printingArray(int arry[]) {
        for(int i=0; i<arry.length; i++) {
            System.out.print(arry[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        //Question 1 [3, 6, 2, 1, 8, 7, 4, 5, 3, 1] 
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(arr);

        printingArray(arr);
    }
}