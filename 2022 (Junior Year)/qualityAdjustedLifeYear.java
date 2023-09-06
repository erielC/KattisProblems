import java.util.Formatter;
import java.util.Scanner;

public class qualityAdjustedLifeYear {
  public static void main(String[] args){
    int i; 
    double q,y;
    double total = 0;

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    for (i = 0; i < n; i++) {
      q = scan.nextDouble();
      y = scan.nextDouble();
      total += q*y;
    }
    scan.close();
  
    Formatter dec = new Formatter();
    System.out.println(dec.format("%.3f", total));

  }
}