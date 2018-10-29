
import java.util.Scanner;
public class StatsTest{
  public static void main(String[] args){

    Stats test = new Stats();
    Scanner input = new Scanner(System.in);

    System.out.println("This program will find the average and standard");
    System.out.println("deviation of a list of numbers you will enter.");
    System.out.print("How many values will you enter? ");
    int stop = input.nextInt();
    int counter = 0;

    while(counter < stop){
      counter = counter + 1;
      System.out.print("Enter your values one at a time: ");
      double buffer = input.nextDouble();
      test.addData(buffer);
    }

    System.out.println("You entered "+test.getCount()+" numbers");

    System.out.println("The average is " +test.getAverage());

    System.out.println("The standard deviation is " +test.getStandardDeviation());

  }
}
