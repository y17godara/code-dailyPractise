// Function/Methods - block of code/ reusable.
import java.util.*;

public class j1syntax {

    
    /*
     returnType name() {
        //body
        return statement;
     }
     */
    
    
    //Example
     public static void printHello(){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        return;
     }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("This Function will be Running... ");

        printHello();


     
        sc.close();
    }
    
}
