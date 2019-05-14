import java.util.*;
public class PaliTest{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Palindrome test = new Palindrome();
    //System.out.print("enter a palindrome: ");
    //String b = input.nextLine();
    String a = "Madam I'm Adam";
    System.out.println("Using string: "+ a);
    System.out.print("The string '" +a+ "' is ");
    if(test.isPalindrome(a)){
      System.out.println("not a palindrome.");
    }else{
      System.out.println("a palindrome.");
    }

  }
}
