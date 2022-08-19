import java.util.*;

public class q4 {

    //Read Inputs Function 
    public static void inputReader(String fruits[]){
        Scanner sc = new Scanner(System.in); //scanner object
        
        for(int i=0; i<fruits.length; i++){ //loop
            System.out.println("Enter Input : ");
            fruits[i] = sc.nextLine(); //read inputs
        }

        sc.close(); //Scanner closed
    }

    //Array Output Function
    public static void outputPrinter(String frueits[]){

        for(int i=0; i< frueits.length; i++){ //loop
            System.out.println(frueits[i]); //print in loop
        }

    }

    //Main
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); //Scanner Object

        System.out.println("Enter Lenght of Array : ");
        int lenght = sc.nextInt(); //lenght reader


        String fruits[] = new String[lenght]; //array created

        inputReader(fruits); //calling function -input

        System.out.println("Output is : " );
        outputPrinter(fruits); //calling function -output


        sc.close(); //Scanner closed

    }
    
}
