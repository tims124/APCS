public class recursion{
  public recursion(){}
  public int calcFibonacci(int i){

    if(i == 0){
      return 0;
    }

    if(i == 1){
      return 1;
    }

    return calcFibonacci(i - 2) + calcFibonacci(i - 1);
  }
}
