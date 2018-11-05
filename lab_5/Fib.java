
import java.util.Scanner;
public class Fib{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("How many terms of the Fibonacci sequence do you want?");
    int a = input.nextInt();
    FibonacciGenerator test = new FibonacciGenerator(a);
    test.counting();

  }
}
