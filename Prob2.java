import java.util.Scanner;

class Prob2 {
  public static void main(String[] args) {
    
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter a string");
  String word = scan.nextLine();
 
  System.out.println(word.substring(0,1));

  System.out.println(word.length()-1);
  }
}