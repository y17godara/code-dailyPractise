//q- continue statement usefor- to skip an iteration

import java.util.Scanner; // imported Scanner sc

public class q11continue {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in); // scanner sc

        for(int i = 1; i<= 5; i++){
            if(i == 3){
                continue; // 3 skipped
            }
            System.out.println(i);
        }

        sc.close(); // sc close

    }
    
}
