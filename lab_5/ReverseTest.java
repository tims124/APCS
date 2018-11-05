import java.util.Scanner;
public class ReverseTest{
  public static void main(String[] args){
    Reverse test = new Reverse();
    Scanner input = new Scanner(System.in);

    System.out.println("This program reverse any string you enter...");
    System.out.print("Enter a string: ");
    String in = input.nextLine();
    test.RevString(in);

  }
}
