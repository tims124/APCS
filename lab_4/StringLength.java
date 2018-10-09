
import java.util.Scanner;
public class StringLength{
  public StringLength(){
  }
    public void SL(){
      Scanner input = new Scanner(System.in);
      System.out.println("Type four strings");

      System.out.print("String one: ");
      String StringOne = input.nextLine();

      System.out.print("String two: ");
      String StringTwo = input.nextLine();

      System.out.print("String three: ");
      String StringThree = input.nextLine();

      System.out.print("String four: ");
      String StringFour = input.nextLine();


      int one = StringOne.length();
      int two = StringTwo.length();
      int three = StringThree.length();
      int four = StringFour.length();

      int june = Math.max(one,two);
      int july = Math.max(three,four);
      int max = Math.max(june,july);

      int may = Math.min(one,two);
      int march = Math.min(three,four);
      int min = Math.min(may,march);

      System.out.println("The lexicographic minimum is: "+min);
      System.out.println("The lexicographic maximum is: "+max);
    }

}
