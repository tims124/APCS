import java.util.*;
public class Factor{
  public Factor(int a){
    first = a;
    count = 0;
  }

  public void findFactor(){
    this.n=2;
    counter = true;
    while(counter){

      if(this.first%this.n == 0){
        if(this.first/this.n == 1){
          factors.add(count,this.n);
          this.counter = false;
        }
        
          factors.add(count,this.n);
          this.first = this.first/this.n;
          this.n=2;
          count = count+1;

      }else{
        this.n=this.n+1;
      }


    }
  }

    public void printFactor(){
      int ListSize = 0;

      while(ListSize < this.count){
        System.out.println(factors.get(ListSize)); //by pulling all of the numbers out of the list
        ListSize = ListSize + 1;
      }

    }

  private int n;
  private int count;
  private boolean counter;
  private double first;
  List<Integer> factors = new ArrayList<Integer>();
}
