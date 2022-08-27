import java.nio.file.WatchEvent;
import java.util.Scanner;

public class q14Rainwater {

    //RainWater Function
    public static void funWater(int bars[]){
        int vol = 0;
        int waterLevel = 0;


        for(int i=0; i<bars.length; i++){

            if(bars[i] <= bars[i+1]){

                waterLevel = bars[i-1];

            }else{

                waterLevel = bars[i+1];
            }

            vol = (waterLevel - bars[i]) * 1;
            System.out.println("Output : "+vol);
        }

    }


    //Main
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int bars[] = {4, 2, 0, 6, 3, 2, 5}; //bars height -array assignes

        funWater(bars); //Condition
   
        sc.close();
    }
    
}
