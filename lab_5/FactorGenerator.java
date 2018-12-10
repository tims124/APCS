import java.util.*;
public class FactorGenerator{
  public FactorGenerator(int a){
    first = a;
    factor = 0;
  }

  public void findFactor(){
        int factor=2;
        boolean state = true;
        while(state){
            if(first%factor == 0 ){
              if(first/factor == 1){
                state = false;
              }
                System.out.println(factor);
                first = first/factor;
                factor=2;
            }else{
              factor++;
            }
        }
  }

  private int first;
  private int factor;
}
