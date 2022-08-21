

public class q10Subarrays {
    //Function
    public static void printSubArray(int nums[]){

        int ts=0;
        for(int i=0; i<nums.length; i++){ //loop
            int start = i;

            for(int j=i; j<nums.length; j++){ //nested loop -2
                int end = j;

                for(int k=start; k<end; k++){
                    System.out.print(nums[k] +" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+ ts );
    }

    //Main
    public static void main(String args[]){

        int nums[] = {2, 4, 6, 8, 10}; //arrays defined

        printSubArray(nums); //function called

    }
}
