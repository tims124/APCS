import java.util.*;
public class Reverse{
  public Reverse(){
  }

  public void RevString(String a){
    String buffer;
    int posStart;
    int posEnd;
    int StringLength = a.length();
    int Length = StringLength;
    int index = 0;
    int counter2 = 0;


    while(StringLength > 0){
      posStart = StringLength -1;
      posEnd = StringLength;

      buffer = a.substring(posStart,posEnd);
      Backwords.add(index,buffer);
      index++;
      StringLength--;
    }
    while(counter2 < Length){
      System.out.print(Backwords.get(counter2));
      counter2++;
  }
  }



  List<String> Backwords = new ArrayList<String>();
}
