import java.util.Scanner;
public class FactorTest{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("This program will find the prime factors of any integer.");
    System.out.print("What is your integer? ");
    int a = input.nextInt();
    FactorGenerator test = new FactorGenerator(a);

    test.findFactor();
  //test.printFactor();


  }
  }
