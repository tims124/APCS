public class reverseTest{
public static void main(String[] args){
      //Scanner input = new Scanner(System.in);
      //System.out.print("Enter a String to be reversed: ");
      //String send = input.nextLine();
      reverseSentence test= new reverseSentence();
      String send = "Hello World!";
      System.out.println("original string: " +send);
      System.out.println("recursive reversing: "+test.reverse(send));
      System.out.println("iteration reversing: "+test.reverseIter(send));
  }
}
