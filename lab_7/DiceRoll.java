import java.util.*;
public class DiceRoll{
  public DiceRoll(int n){
    rolls = n;
    val = new int[11];
  }

  public void roll(){
    Random random = new Random();
    int counter = 0;
    while(counter < rolls){
      int val1 = random.nextInt(6)+1;
      int val2 = random.nextInt(6)+1;
      val[val1+val2-1]++;
      System.out.println(val[val1+val2-1]);
      counter++;
    }
  }
  public int getNumber(int n){
    return val[n-1];
  }
  public void displayResults(){
    int counter=0;
    while(counter< val.length){
      int buffer = counter + 1;
      System.out.println(buffer+"'s: "+val[buffer]);
    }
   }

  public void displayHistogram(){
    int count=0;
    int count1 = 0;
    int max = this.max();
    int pos = max;

    while(count < max){

     if(pos > 9 ){
         System.out.print(pos+" |");
     }else{
         System.out.print(pos+"  |");
     }

     count1=0;
     while(count1 <12){
       if(val[count1] >= pos){
         System.out.print(" "+"*");
       }else{
         System.out.print("   ");
       }
       count1++;
     }
     System.out.println("");
     count++;
     pos--;

   }
   System.out.println("---------------------------------------");
   System.out.println("    	 1  2  3  4  5  6  7  8  9  10 11 12");

  }
  private int max(){
    int counter = 0;
    int buffer;
    int max = val[counter];
    while(counter < 12){
      buffer = val[counter];
      max = Math.max(max,buffer);
      counter++;
    }
    return max;
  }


  private int rolls;
  private int[] val;
}
