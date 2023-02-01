import java.util.Scanner;

public class tarifa {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // x = megabytes allowed to use by provides
    // y = how many months have passed
    // n = are the test cases that follow
    int x = scan.nextInt();
    int y = scan.nextInt();

    int firstCase = scan.nextInt();
    int workWith = x - firstCase;

    int added = x + workWith;
 
    int total = 0;

    for(int i = 0; i < (y-1); i++) {
      int n = scan.nextInt();
      x += added - n;
      total += x;
    }
    scan.close();
  
    System.out.println(total);
  }
}
