

import java.util.Scanner;
public class StringLength{
  public StringLength(){
  }
    public void SL(){
      Scanner input = new Scanner(System.in);

      boolean end = true;
      String NewString = "";
      String StringBuffer = "";
      String StringMax = "";
      String StringMin = "";
      int IntBuffer = 0;
      int StringLMax = 0;
      int StringLMin = 10000;

      System.out.println("This program will keep track of the lexographic");
      System.out.println("minimum and maximum of a list of words you will enter,");
      System.out.println("without regard to upper and lower case. When your list");
      System.out.println("is complete, enter end.");


      while(end){
      System.out.print("Enter a word: ");
      NewString = input.nextLine();

      StringBuffer = NewString;
      IntBuffer = StringBuffer.length();

      NewString = NewString.toLowerCase();
      if(NewString.equals("end")){
        end = false;
      }


        if(IntBuffer > StringLMax){
          StringLMax = IntBuffer;
          IntBuffer = 0;
          StringMax = StringBuffer;
          StringBuffer ="";
        }

        if(IntBuffer < StringLMin){
          StringLMin = IntBuffer;
          IntBuffer = 0;
          StringMin = StringBuffer;
          StringBuffer = "";
        }
      }

      /*
      int june = Math.max(one,two);
      int july = Math.max(three,four);
      int max = Math.max(june,july);

      int may = Math.min(one,two);
      int march = Math.min(three,four);
      int min = Math.min(may,march);
      */
      System.out.println("The lexicographic minimum is: "+StringLMin);
      System.out.println("The lexicographic maximum is: "+StringLMax);
    }

}