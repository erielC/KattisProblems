import java.util.Scanner;

public class autori {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String word = scan.nextLine();

    if (word.length() < 14) {
      System.out.println(word.substring(0,1) + word.substring(6, 7));
    } else {
      System.out.println(word.substring(0,1) + word.substring(6, 7) + word.substring(13, 14));
    }

    

    scan.close();
  }
}
