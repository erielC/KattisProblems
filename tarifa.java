import java.util.Scanner;

public class tarifa {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // x = megabytes allowed to use by provides
    // y = how many months have passed
    // n = are the test cases that follow
    int x = scan.nextInt();
    int y = scan.nextInt();
    int actualTotal = 0;

    for (int i = 0; i < y; i++) {
      int n = scan.nextInt();
      int remainder = 10-8; 
      int total = x + remainder;
      actualTotal = total - 10;
    }
    System.out.println(actualTotal);
    scan.close();
  }
}
