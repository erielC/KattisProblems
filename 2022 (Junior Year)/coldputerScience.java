import java.util.Scanner;

public class coldputerScience {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numOfCase = scan.nextInt();
    int value = 0;


    for (int i = 0; i < numOfCase; i++) {
      int temp = scan.nextInt();

      if (temp < 0){
        value += 1;
      }

    }
    System.out.println(value);
    
    scan.close();
    }
}
