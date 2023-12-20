import java.util.Scanner;
 
public class echoEchoEcho {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String word = scan.nextLine();
    scan.close();
    System.out.println(word.toUpperCase() + " " + word.toUpperCase() + " " + word.toUpperCase());


  }
}
