import java.util.Scanner;

public class takeTwoStones {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();

    if(num % 2 == 0 ){
      System.out.println("Bob");
    } else {
      System.out.println("Alice");

    }

     
    scan.close();
  
  }
}
