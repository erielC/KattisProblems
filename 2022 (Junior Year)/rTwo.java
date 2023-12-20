import java.util.Scanner;

public class rTwo {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
    
   int a = scan.nextInt(); 
   int b = scan.nextInt();

   System.out.println(2 * b - a);

    scan.close();
  }
}
