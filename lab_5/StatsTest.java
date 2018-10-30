
import java.util.*;
import java.util.Scanner;
public class StatsTest{
  public static void main(String[] args){

    //setup stuff
    Stats test = new Stats();
    Scanner input = new Scanner(System.in);
    double A = 0;
    double B = 0;
    double C = 0;
    int counter = 0;

    //finds out how many numbers are going to be entered
    System.out.println("This program will find the average and standard");
    System.out.println("deviation of a list of numbers you will enter.");
    System.out.print("How many values will you enter? ");
    int stop = input.nextInt();

    //throws those numbers into the class
    while(counter < stop){
      System.out.print("Enter your values one at a time: ");
      double buffer = input.nextDouble();
      test.addData(buffer);
      counter = counter + 1;
    }

    //output stuff
    System.out.println("You entered "+test.getCount()+" numbers");

    System.out.println("The average is " +test.getAverage());

    System.out.println("The standard deviation is " +test.getStandardDeviation());

  }
}
