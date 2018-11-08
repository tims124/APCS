
import java.util.Scanner;
public class Combination {
/* Constructor which constructs a lock with a given combination.
The combination is a string of three uppercase letters. */
  public Combination(String a){
    L1 = a.substring(0,1);
    L2 = a.substring(1,2);
    L3 = a.substring(2,3);
    LockState = false;
  }

/* Method to set the dial to a position, which is a string consisting
of a single uppercase letter. */
  public void setPosition(){
    String t1 = "";
    String t2 = "";
    String t3 = "";
    Scanner input = new Scanner(System.in);
    String check = "y";
    int counter = 0;
    P1 = "";
    P2 = "";
    P3 = "";

    while(counter == 0){
      while(counter<3){
        if (counter >= 3){
          this.P1 = P2 ;
          this.P2 = P3 ;
          this.P3 = "" ;
        }

        if (P1.equals("")){
          System.out.print("Set first position: ");
          t1 = input.nextLine();
          this.P1 = t1.toLowerCase();
        }else{
          if(P2.equals("")){
            System.out.print("Set next position: ");
            t2 = input.nextLine();
            this.P2 = t2.toLowerCase();
          }else{
            if(P3.equals("")){
                System.out.print("Set next position: ");
                t3 = input.nextLine();
                this.P3 = t3.toLowerCase();
              }
            }
      }

      counter++;
    }
    System.out.print("Set different positions?(Y/N)");
    String in = input.nextLine();
    in = in.toLowerCase();
      if(in.equals("y")){
        counter = 0;
  }else{
    counter = 100000;
  }
    }
    }


/* Method to try unlocking the lock*/
  public void unlock(){
      int lockcheck = 0;
      if(P1.equals(L1.toLowerCase())){
        lockcheck = lockcheck + 1;
      }
      if(P2.equals(L2.toLowerCase())){
        lockcheck = lockcheck + 1;
      }
      if(P3.equals(L3.toLowerCase())){
        lockcheck = lockcheck + 1;
      }

      if(lockcheck == 3){
        this.LockState = true;
      }else{
        this.LockState = false;
      }
  }


 /*Method to check if the lock is unlocked. Return true if the
lock is currently open.*/

  public boolean isOpen(){
  if(this.LockState){
    return true;
  }else{
    return false;
  }
  }


/* Method to close the lock*/
  public void lock( ){
    this.LockState = false;
  }


private String Combination;
private Boolean LockState;
private String P1;
private String P2;
private String P3;
private String L1;
private String L2;
private String L3;
}
