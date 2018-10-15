
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
    Scanner input = new Scanner(System.in);
    String check = "y";
    int counter = 0;
    P1 = "";
    P2 = "";
    P3 = "";

    while(check.equals("y")){
      if (counter >= 3){
        P1 = P2 ;
        P2 = P3 ;
        P3 = "" ;
      }

      if (P1.equals("")){
        System.out.print("Set next position: ");
        this.P1 = input.nextLine();
      }else{
        if(P2.equals("")){
          System.out.print("Set next position: ");
          this.P2 = input.nextLine();
        }else{
          if(P3.equals("")){
              System.out.print("Set next position: ");
              this.P3 = input.nextLine();
          }
        }
      }


        System.out.println("Set another position(Y/N): ");
        check = input.nextLine();
        check = check.toLowerCase();
        counter = counter + 1;
    }
    }


/* Method to try unlocking the lock*/
  public void unlock(){
      int lockcheck = 0;
      if(P1.equals(L1)){
        lockcheck = lockcheck + 1;
      }
      if(P2.equals(L2)){
        lockcheck = lockcheck + 1;
      }
      if(P3.equals(L3)){
        lockcheck = lockcheck + 1;
      }

      if(lockcheck == 3){
        this.LockState = true;
      }
  }


 /*Method to check if the lock is unlocked. Return true if the
lock is currently open.*/

  public boolean isOpen(){
  if(LockState){
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
