public class selection {
    //Function
    public static void selectedArray(int arry[]) {
        for(int i=0; i<arry.length-1; i++) {

            int minPos = i;
            for(int j=i+1; j<arry.length; j++) {

                if(arry[minPos] > arry[j]) {
                    minPos = arry[j]; //exchange
                }
            }
            //swap
            int temp = arry[minPos];
            arry[minPos] = arry[i];
            arry[i] = temp;
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

        //array created
        int arry[] = {5, 4, 1, 3, 2};

        selectedArray(arry); //selection arry function called

        printingArray(arry); //arry printing function called
    }
    
}
