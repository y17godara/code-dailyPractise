import java.util.Scanner; // import the Scanner class 

public class javainput {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);    
    
    // nextBoolean()	Reads a boolean value from the user
    // nextByte()	Reads a byte value from the user
    // nextDouble()	Reads a double value from the user
    // nextFloat()	Reads a float value from the user
    // nextInt()	Reads a int value from the user
    // nextLine()	Reads a String value from the user
    // nextLong()	Reads a long value from the user
    // nextShort()	Reads a short value from the user
    
  }
}