package extraWork;
import java.util.Scanner;

public class q5 {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Distance (in meters) ");
        float distance = myObj.nextFloat();

        System.out.println("Enter Time in (hrs) ");
        int hr = myObj.nextInt();

        System.out.println("Enter Time in (mins) ");
        int min = myObj.nextInt();

        System.out.println("Enter Time in (secs) ");
        int sec = myObj.nextInt();

        float timeSeconds;
		float mps,kph, mph;

        timeSeconds = (hr*3600) + (min*60) + sec; // time-secs

        mps = (distance / timeSeconds);

        kph = (distance/1000.0f) / (timeSeconds/3600.0f);

        mph = kph / 1.609f;

        System.out.println("Your speed in meters/second is "+mps);
		System.out.println("Your speed in km/h is "+kph);
		System.out.println("Your speed in miles/h is "+mph);

    }
      
}
