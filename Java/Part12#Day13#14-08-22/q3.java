import java.util.*;

public class q3 {

    //Function
    public static int linearSearch(int marks[], int key){

        for(int i=0; i<marks.length; i++){ //loop to compair key

            if(marks[i] == key){ //compairing

                return 1; //returns 1 if key matches
            }

        }
        return -1; //key does not-exist
    }

    //Main
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //scanner

        int marks[] = {2, 4, 6, 8, 10, 12, 14, 16}; //array created

        System.out.println("{2, 4, 6, 8, 10, 12, 14, 16} "); //Outputs
        System.out.println("Enter Key to Find : ");
        int key = sc.nextInt();

        int index = linearSearch(marks, key); //function called

        if(index == -1){ //loop to check -1 or 1;
            System.out.println("Key Not Present!");
        }
        else{
            System.out.println("Key Found "+ key +" at "+ index ); 
            //Final Output
        }


        sc.close(); //scanner close
    }
    
}
