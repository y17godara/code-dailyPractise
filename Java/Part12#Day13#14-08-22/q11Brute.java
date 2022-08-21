

public class q11Brute {
    //Function
    public static void printSubArray(int nums[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){ //loop
            int start = i;

            for(int j=i; j<nums.length; j++){ //nested loop -2
                int end = j;
                currSum = 0;

                for(int k=start; k<=end; k++){
                    //subarray sum
                    currSum += nums[k];
                }
                System.out.println(currSum); //Printing all existing sums

                //Condition
                if(maxSum < currSum){                     
                    maxSum = currSum; //MaxSum declare Here
                }
            }
        }
        System.out.println("Max Sum : "+ maxSum);
    }

    //Main
    public static void main(String args[]){

        int nums[] = {2, 4, 6, 8, 10}; //arrays defined

        printSubArray(nums); //function called

    }
}

