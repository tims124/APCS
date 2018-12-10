import java.util.*;
public class FishSwim{
  public FishSwim(int len, double p){
    tank = new String[len];
    dircprb = p;

    pos = (int)(Math.random() * len);
    for(int counter = 0; counter < len; counter++){
      tank[counter] = "-";
    }
    tank[pos] = "*";
  }

  private void swimOneUnit(){
    double rand = Math.random();
    if(rand < dircprb){
      if(pos == tank.length-1){
        pos--;
      }else{
      pos++;
    }
    }else{
      if(pos == 0){
        pos++;
      }else{
        pos--;
    }
  }
      for(int counter = 0; counter < tank.length; counter++){
        tank[counter] = "-";
      }

      tank[pos] = "*";
    }


  private void displayTank(){
    for(int counter = 0; counter < tank.length; counter++){
      System.out.print(tank[counter]);
    }
    System.out.println("");
  }

  public void swim(int n){
    for(int counter = 0; counter < n; counter++){
      this.displayTank();
      this.swimOneUnit();
    }
  }


  private int pos;
  private double dircprb;
  private String[] tank ;
}
