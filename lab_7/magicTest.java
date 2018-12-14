import java.util.*;
public class magicTest{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the length of the sides of your magic square: ");
  int l = input.nextInt();
  magicSquare test = new magicSquare(l);
  test.fillSquare();
  test.check();
  }
}
