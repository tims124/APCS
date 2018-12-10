import java.util.*;
public class FishTest{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("What is the length of the fish tank: ");
    int len = input.nextInt();
    System.out.print("What is the probability of the fish swimming right(between 0 and 1): ");
    double prb = input.nextDouble();
    System.out.print("How many times do you want the fish to swim: ");
    int n = input.nextInt();
    FishSwim test = new FishSwim(len,prb);
    test.swim(n);
  }
}
