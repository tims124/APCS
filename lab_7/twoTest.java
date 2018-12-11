import java.util.*;
public class twoTest{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("This program makes a matrix with random values given user input...");
    System.out.println("");
    System.out.print("How many rows do you want in the matrix: ");
    int r = input.nextInt();
    System.out.print("How many columns do you want in the matrix: ");
    int c = input.nextInt();
    System.out.print("What is the max value you want for the matrix: ");
    int v = input.nextInt();

    twoD test = new twoD(r,c);
    test.fillTwoDArray(v);
    test.displayArray();
  }
}
