import java.util.Scanner;

public class jackOLanternJuxta {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    int y = scan.nextInt(); 
    int z = scan.nextInt();
    scan.close();

    System.out.println(x * y * z);

  }
}