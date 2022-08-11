import java.util.*;

public class q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Max ");
        int max = sc.nextInt();
        char ch = 'A';

        for(int i = 1; i<=max; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(ch);
            }
            System.out.println();
        }

        sc.close();
    }
    
}
