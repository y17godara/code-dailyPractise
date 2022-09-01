public class bubble {

    //Function -Bubble Sorting,  TC = O(n^2)
    public static void bubbleSorting(int arry[]) {

        for(int turn=0; turn < arry.length-1; turn++) {

            for(int j=0; j < arry.length - 1 - turn; j++) {

                if(arry[j] > arry[j+1]) {

                    //Swap
                    int temp = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = arry[j];

                }
            }
        }

    }

    //Function -Array Printing
    public static void printingArray(int arry[]) {

        for(int i=0; i<arry.length-1; i++) {
            System.out.print(arry[i]+" ");
        }
        System.out.println();
    }

    //Main
    public static void main(String args[]) {

        //Array Defined
        int arry[] = {5, 4, 1, 3, 2};

        //Function Calling
        bubbleSorting(arry);

        //Array Print Function Calling
        printingArray(arry);

    }
    
}
