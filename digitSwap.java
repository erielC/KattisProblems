import java.util.Scanner;

public class digitSwap {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt(); 
    scan.close();

    String conversion = Integer.toString(x);


    System.out.print(conversion.substring(1,2));

    System.out.print(conversion.substring(0,1));

    

    
    // Turn into an String 

    //Get subtring of Num and printing index 1 then index 0
   
  }
}
