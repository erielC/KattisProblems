import java.util.Scanner;

public class  jumboJavelin {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numOfTimes = scan.nextInt();
    int total = 0;
    int x;

    for (int i=0; i < numOfTimes; i++){
      x = scan.nextInt();
      total += x;
    }
    System.out.println(total - (numOfTimes - 1));

  }
}