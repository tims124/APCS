public class PaliTest{
  public static void main(String[] args){
    Palindrome test = new Palindrome();
    String b = "testTSET";
    String a = "a Santa at Nasa";
    System.out.print("The string '" +a+ "' is ");
    if(!test.isPalindrome(a)){
      System.out.println("not a palindrome.");
    }else{
      System.out.println("a palindrome.");
    }

  }
}
