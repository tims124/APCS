public class FibonacciGenerator{
  public FibonacciGenerator(int a){
    count = a;
  }

  public void counting(){
    long counter = 0;
    long val1 = 1;
    long val2 = 1;
    long buffer = 0;

    System.out.print(val1+", "+val2+", ");
    while(counter<(count-2)){
      buffer = val1 + val2;
      val1 = val2;
      val2 = buffer;
      System.out.print(buffer);
      counter++;
      if(counter<(count-2)){
        System.out.print(", ");
      }
    }

  }

  private int count;
}
