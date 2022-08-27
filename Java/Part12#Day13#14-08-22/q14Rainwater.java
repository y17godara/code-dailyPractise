import java.util.Scanner;

public class q14Rainwater {

    //RainWater Function
    public static void funWater(int barsH[]){
        int vol = 0;

        for(int i=0; i<barsH.length; i++){

            vol = (barsH[i-1]-barsH[i])*1; // (water lvl/ bar lvl )*1
            System.out.println("Vol is : ");
            System.out.println(vol);
        }



       
    }


    //Main
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int barsH[] = {4, 2, 0, 6, 3, 2, 5}; //bars height -array assignes

        funWater(barsH); //function Water -function called

        sc.close();
    }
    
}
