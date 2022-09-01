public class bubble {

    //Function -Bubble Sorting,  TC = O(n^2)
    public static void bubbleSorting(int arry[]) {

        //loop1
        for(int turn=0; turn < arry.length-1; turn++) {

            //loop2
            for(int j=0; j < arry.length - 1 - turn; j++) {

                //comparision
                if(arry[j] > arry[j+1]) {

                    //Swap
                    int temp = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = temp;

                }
            }
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
