import java.util.Scanner;

public class electricalOutlets {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numOfCases = scan.nextInt();

    for(int i = 0; i < numOfCases; i++) {
      int testCase = scan.nextInt();
      int apps = 0;
      for (int j = 0; j < testCase; j++){
        apps += scan.nextInt() - 1;
        
      }
      
      System.out.println(apps + 1);
    }
    scan.close();
  }
}
