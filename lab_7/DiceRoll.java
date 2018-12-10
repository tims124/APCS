import java.util.*;
public class DiceRoll{
  public DiceRoll(int n){
    rolls = n;
    val = new int[12];
  }

  public void roll(){
    Random random = new Random();
    int counter = 0;
    while(counter < rolls){
      int val1 = random.nextInt(6)+1;
      //System.out.println(val1);
      int val2 = random.nextInt(6)+1;
      //System.out.println(val2);
      val[val1+val2-1]++;
    //  System.out.println(val1+val2);
      counter++;
    }
  }
  public int getNumber(int n){
    return val[n];
  }
  public void displayResults(){
    int counter=0;
    System.out.println("");
    System.out.println("Dice Values: ");
    while(counter < val.length){
      int buffer = counter + 1;
      System.out.println(counter+1+"'s: "+val[counter]);
      counter++;
    }
   }

  public void displayHistogram(){
    System.out.println("");
    System.out.println("Histogram");
    System.out.println("------------------------------------------");
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
         System.out.print("  "+"*");
       }else{
         System.out.print("   ");
       }
       count1++;
     }
     System.out.println("");
     count++;
     pos--;

   }
   System.out.println("------------------------------------------");
   System.out.println("      1  2  3  4  5  6  7  8  9  10 11 12");

  }
  private int max(){
    int counter = 0;
    int buffer = 0;
    int max = val[counter];
    while(counter < val.length){
      buffer = val[counter];
      max = Math.max(max,buffer);
      counter++;
    }
    return max;
  }


  private int rolls;
  private int[] val;
}
