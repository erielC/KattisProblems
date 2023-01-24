import java.util.Scanner;

public class magicTrick {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    x = 0;
    String intialArrangemnet = scan.nextLine();
    int length = intialArrangemnet.length();

    for(int i = 0; i < length; i++){
      System.out.println(intialArrangemnet.substring(i));
      for(int j = i + 1; i < length;) {
        if (intialArrangemnet.substring(i) == intialArrangemnet.substring(j)) {
          int x = 1;
        } else {
          int x = 0;
        }
      }
      
    }
    
    System.out.println(x);
  }
}
