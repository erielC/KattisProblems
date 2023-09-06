import java.util.Scanner;

public class fyi {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 

    int num = scan.nextInt();
    scan.close();
    //Converting Integer to String
    String beginningNum = Integer.toString(num);

    //Finding First three numbers
    String phoneLength = beginningNum.substring(0,3);
    // Converting String back to Integer
    int convertFirstThree = Integer.parseInt(phoneLength);

    if (convertFirstThree == 555) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

    
  }
}
