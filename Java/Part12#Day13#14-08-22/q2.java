//A program that have two functios -Input for Arrays -Print Arrays

import java.util.*; // Scanner Import


public class q2 {

    //Input Reader Function
    public static void inputReader(int marks[], int lenght){

        Scanner sc = new Scanner(System.in); //Scanner Object 

        for(int i=0; i<lenght; i++){ //Loop

            marks[i] = sc.nextInt(); //input for marks[]
        }
        sc.close(); //Scanner closed
    }

    //Print Arrays Function
    public static void outputPrinter(int marks[], int lenght){

        for(int i=0; i<lenght; i++){ //loop

            System.out.println(marks[i]); //print statement
        }
    }


    //Main
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //Scanner Object 

        System.out.println("Enter Lenght to Inputes: ");
        int lenght = sc.nextInt();

        int marks[] = new int[lenght]; //Array- marks[] Created
        System.out.println("Arrays Created Succesfully with "+ lenght +" lenght.");

        System.out.println("Now Enter Your Arrays keys : ");
        inputReader(marks, lenght); //function- called


        System.out.println("Now it Will Print marks[] : ");
        outputPrinter(marks, lenght);

        sc.close(); //Scanner closed
    }
}
