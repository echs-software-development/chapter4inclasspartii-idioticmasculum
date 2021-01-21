import java.util.Scanner;

class Prob1 {
  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

  System.out.println("Enter a sentence:");

  String w1 = scan.nextLine();

  //up until the first space

  System.out.println(w1.indexOf(" "));

   

  }
}