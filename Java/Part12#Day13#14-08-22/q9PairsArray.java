//Pairs in Arrays

public class q9PairsArray {

    //Pairing Function
    public static void arrayPairing(int nums[]){
        int tp=0;

        for(int i=0; i<nums.length; i++){ //loop -1
            
            int curr = nums[i]; 

            for(int j=i+1; j<nums.length; j++){ //nested loop -2

                System.out.print("("+ curr +","+ nums[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+ tp);
    }

    //Main
    public static void main(String args[]) {

        int nums[] = {2, 4, 6, 8, 10}; //arrays defined

        arrayPairing(nums); //function calling
    }
    
}
