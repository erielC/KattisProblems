import java.util.Formatter;
import java.util.Scanner;

public class qualityAdjustedLifeYear {
  public static void main(String[] args){
    int i; 
    float q,y;
    float total = 0;

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    for (i = 0; i < n; i++) {
      q = scan.nextFloat();
      y = scan.nextFloat();
      total += q*y;
    }
    scan.close();
  
    Formatter dec = new Formatter();
    System.out.println(dec.format("%.3f", total));

  }
}