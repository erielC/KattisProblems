import java.util.Scanner;
 
public class filip {

  static int reverseA (int a) {
    
    int rev = 0;
    int rem; 
    while (a > 0) {
      rem = a%10;
      rev = (rev*10) + rem;
      a = a/10;
    }
    return rev;
  }

  static int reverseB (int b) {
    
    int rev = 0;
    int rem; 
    while (b > 0) {
      rem = b%10;
      rev = (rev*10) + rem;
      b = b/10;
    }
    return rev;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();

    if (reverseA(a) > reverseB(b)) {
      System.out.println(reverseA(a));
    } else {
      System.out.println(reverseB(b));
    }


   
    scan.close();
  }
}
