import java.util.Scanner;

public class greetings {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // hey (letter E is on the 1 index number)
    String text = scan.nextLine();
    int n = (text.length() * 2) - 4;
    scan.close();
    
    System.out.print("h");
    for (int i = 0; i < n; i++){
      System.out.print("e");
    }
    
    System.out.print("y");
    
  }
}
