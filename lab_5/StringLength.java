

import java.util.Scanner;
public class StringLength{
  public StringLength(){
  }
    public void SL(){
      Scanner input = new Scanner(System.in);

      boolean end = true;
      String NewString = "";
      String StringBuffer = "";
      String CharBuffer = "";
      String StringMax = "";
      String StringMin = "";
      int IntBuffer = 0;
      int StringLMax = 0;
      int StringLMin = 0;

      System.out.println("This program will keep track of the lexographic");
      System.out.println("minimum and maximum of a list of words you will enter,");
      System.out.println("without regard to upper and lower case. When your list");
      System.out.println("is complete, enter end.");

      System.out.print("Enter a word: ");
      NewString = input.nextLine();

      NewString = NewString.toLowerCase();
      StringMax = NewString;
      StringMin = NewString;
      CharBuffer = NewString.substring(0,1);
      StringLMax = CharBuffer.compareTo("a");
      StringLMin = StringLMax;

      while(end){
      System.out.print("Enter a word: ");
      NewString = input.nextLine();

      NewString = NewString.toLowerCase();
      StringBuffer = NewString;
      CharBuffer = StringBuffer.substring(0,1);
      System.out.println(CharBuffer);

      if(NewString.equals("end")){
        end = false;
      }

      if(end){
        IntBuffer = CharBuffer.compareTo("a");
        System.out.println(IntBuffer);

        if(IntBuffer >= StringLMin){
          StringLMin = IntBuffer;
          StringMin = StringBuffer;
        }

        if(IntBuffer <= StringLMax){
          StringLMax = IntBuffer;
          StringMax = StringBuffer;
        }

      }
    }


      System.out.println("The lexicographic maximum is: "+StringMax);
      System.out.println("The lexicographic minimum is: "+StringMin);
    }

}
