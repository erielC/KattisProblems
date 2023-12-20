import java.util.Scanner;
import java.util.Formatter;

public class metronome {
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);
    Formatter dec = new Formatter();

    double number = scan.nextInt();

    System.out.println(dec.format("%.2f", (number/4)));

    scan.close();
  }
}
