import java.util.Scanner;

public class nSum {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int i, numX;
    int total = 0;

    int n = scan.nextInt();

    for (i = 0; i < n; i++) {
      numX = scan.nextInt();
      total += numX;
    }
    
    System.out.println(total);
    scan.close();
  }
}