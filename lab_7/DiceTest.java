import java.util.*;
public class DiceTest{
  public static void main(String[] args){
    int counter = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("How many times do you want the roll the dice? ");
    int n = input.nextInt();
    DiceRoll test = new DiceRoll(n);
    test.roll();
    while(counter < 12){
      test.getNumber(counter);
      counter++;
    }
    test.displayResults();
    test.displayHistogram();
  }
}
