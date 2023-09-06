import java.util.Scanner;

public class magicTrick {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); 
   
    String word = scan.nextLine();
    int ans = 1;
    scan.close();
    for (int i = 0; i < word.length(); i++) {
      for (int j = i + 1; j < word.length(); j++) {
       if (word.substring(i, i + 1).equals(word.substring(j, j +1))){
        ans = 0;
       }
       
      }
    }
    scan.close();  
    System.out.println(ans);
  }
}
