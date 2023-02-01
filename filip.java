import java.util.Scanner;

public class filip {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();

    String convertedA = Integer.toString(a);

    System.out.println(convertedA);
    System.out.println("-------------");

    System.out.print(convertedA.substring(2));
    System.out.print(convertedA.substring(1));
   

    scan.close();
  }
}
