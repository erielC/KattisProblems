 import java.util.Scanner;
 
 public class findingAnA {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String text = scan.nextLine();
    scan.close();
    int letterA = text.indexOf("a");   
    System.out.println(text.substring(letterA));

  }
}
