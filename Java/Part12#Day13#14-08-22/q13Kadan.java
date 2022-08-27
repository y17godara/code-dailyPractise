import javax.swing.plaf.synth.SynthSpinnerUI;

public class q13Kadan {

    //Prefix Function
    public static void kadansArray(int nums[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0; //current sum

        for(int i=0; i<nums.length; i++){

            cs = cs+nums[i]; //new current sum changes with loop[i]

            if(cs<0){ //if statement
                cs=0;
            }
            ms= Math.max(cs, ms); //assign ms = maximum between cs and ms

        }

        System.out.println("Max Subarray Sum : "+ ms); //output
    }

    //Main
    public static void main(String args[]){

        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3}; //arrays defined

        kadansArray(nums); //function called
        //NOTE: If out Arrays Contains All the Maximum Value SO Kadans Algo Returns 0.
        
    }
    
}
