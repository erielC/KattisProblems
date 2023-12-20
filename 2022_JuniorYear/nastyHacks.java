import java.util.Scanner;

public class nastyHacks{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
 
    int testCase = scan.nextInt();

    // R is expected revenue w/o advertisement
    // E is expected revenue w/ advertisement
    // C is cost of advertising
    
    for(int i = 0; i < testCase; i++) {
      int r = scan.nextInt();
      int e = scan.nextInt();
      int c = scan.nextInt();
      
      if((e-c) > r) {
        System.out.println("advertise");
      } else if ((e-c) == r) {
        System.out.println("does not matter");
      } else {
        System.out.println("do not advertise");
      }
    }

    scan.close();
  }
}
