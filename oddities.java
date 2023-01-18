import java.util.Scanner;

public class oddities {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


    int num = scan.nextInt();

    for (int i = 0; i < num; i++) {
      int testCase = scan.nextInt();

      if(testCase % 2 == 0) {
        System.out.println(testCase + " is even");
      } else {
        System.out.println(testCase + " is odd");
      }
    }

    scan.close();
  }
}