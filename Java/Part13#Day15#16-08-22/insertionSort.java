public class insertionSort {

    //Insertion Sort Function
    public static void insertionSort(int arry[]) {

        for(int i=1; i<arry.length; i++) {

            int curr = arry[i]; //current element
            int prev = i-1; //previous element

            //finding out the correct position to insert element
            while(prev >=0 && arry[prev] > curr) {

                arry[prev + 1] = arry[prev];
                prev--;
            }
            //inserting 
            arry[prev + 1] = curr;

        }
    }

    //Function -Array Printing
    public static void printingArray(int arry[]) {

        //Loop for Printing Array
        for(int i=0; i<arry.length; i++) {

            //Printing
            System.out.print(arry[i]+" ");
        }
        System.out.println(); 
    }


    public static void main(String args[]) {
        
        int arry[] = {5, 4, 1, 3, 2}; //array defined

        insertionSort(arry); //function calling

        printingArray(arry); //printing array

        /*Time Complexity = O(n^2) */
     
    }
    
}
