import java.util.Scanner;

public class knightPacking {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int chessBoardSize = scan.nextInt();
    scan.close();

    int totalSize = chessBoardSize * chessBoardSize;

    if (totalSize % 2 == 0){
      System.out.println("second");
    } else {
      System.out.println("first");
      
    }

  }
}
