package extraWork;
import java.util.Scanner;

public class q4 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Weight in (pounds) ");
        float weight = myObj.nextFloat();

        System.out.println("Enter Height in (inches) ");
        float height = myObj.nextFloat();

        float bmi = (weight / (height*height) * 703);
        System.out.println("BMI for the given body "+ bmi);

    }
    
}
