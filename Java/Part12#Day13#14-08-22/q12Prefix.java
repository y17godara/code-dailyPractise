public class q12Prefix {

    //Prefix Function
    public static void prefixArray(int nums[]) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++){ //loop

            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=0; i<nums.length; i++){  //loop -1
            int start = i;

            for(int j=0; j<nums.length; j++){ //loop nested -2
                int end=j;

                currSum = start== 0? prefix[end] : prefix[end]- prefix[start-1];

                if(MaxSum < currSum){ //comparision
                    
                    MaxSum = currSum; //maxsum assigned
                }
            }
        }

        System.out.println("Max Sum : "+ MaxSum);//print Output
    }

    //Main
    public static void main(String args[]){

        int nums[] = {1, -2, 6, -1, 3}; //arrays defined

        prefixArray(nums); //function called
        
    }
    
}
