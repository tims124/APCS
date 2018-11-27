import java.util.Random;
public class ArrayClass{
  public ArrayClass(int n){
    arraylength = n;
    val = new int[n];
    System.out.println(n);
  }

  public void fillArray(int n){
    Random random = new Random();
    int counter = 0;
    while(counter < val.length){
      int rand = random.nextInt(n+1);
      System.out.println(rand);
      val[counter] = rand;
      System.out.println(val[counter]);
      counter++;
    }
  }

  public int findMax(){
    int counter = 0;
    int max = val[counter];
    int buffer;
    while(counter < this.arraylength){
      counter++;
      buffer = val[counter];
      max = Math.max(max,buffer);
    }
    return max;
  }

  public int findMin(){
    int counter = 0;
    int min = val[counter];
    int buffer;

    while(counter < arraylength){
      counter++;
      buffer = val[counter];
      min = Math.min(min,buffer);
    }
    return min;
  }

  public int sumArray(){
    int counter = 0;
    int sum = 0;
    int buffer = 0;
    while(counter < arraylength){
      sum +=val[counter];
      counter++;
    }
    return sum;
  }

  public double avgArray(){
    int sum = this.sumArray();
    double avg = (double)(sum / arraylength);
    return avg;
  }

  public void displayArray(){
    int counter = 0;
    while(counter < arraylength){
      System.out.print("Index: "+counter);
      System.out.println(" | Value: "+val[counter]);
      counter++;
    }
  }

  public int valueAt(int n){
    int out = val[n];
    return out;
  }

  public int findValue(int n){
    int counter = 0;
    int out;
    while(counter < arraylength){
      if(val[counter] == n){
        out = counter;
        counter = arraylength;
      }
      counter++;
    }
    return counter;
  }

  public void reverseArray(){
    int counter = 0;
    int buffer1;
    int buffer2;
    while(counter < Math.floor(arraylength)){
      buffer1 = val[counter];
      buffer2 = val[arraylength - counter];
      val[counter] = buffer2;
      val[arraylength - counter] = buffer1;
    }
  }
private int arraylength;
private int[] val;

}
