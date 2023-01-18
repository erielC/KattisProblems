import java.util.Scanner;

public class fyi {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();
    scan.close();

    String beginningNum = Integer.toString(num);
    String phoneLength = beginningNum.substring(0,3);

    int convertFirstThree = Integer.parseInt(phoneLength);

    if (convertFirstThree == 555) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

    
  }
}
