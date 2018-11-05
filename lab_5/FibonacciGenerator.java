public class FibonacciGenerator{
  public FibonacciGenerator(int a){
    count = a;
  }

  public void counting(){
    int counter = 0;
    int val1 = 1;
    int val2 = 1;
    int buffer = 0;
    while(counter<count){

      buffer = val1 + val2;
      val1 = val2;
      val2 = buffer;
      System.out.print(buffer+", ");
      counter++;
    }

  }

  private int count;
}
