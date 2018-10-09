
import java.util.Scanner;
public class CombinationLock {
/* Constructor which constructs a lock with a given combination.
The combination is a string of three uppercase letters. */
  public CombinationLock(String aCombination){
      Combination = a;
  }

/* Method to set the dial to a position, which is a string consisting
of a single uppercase letter. */
  public void setPosition(String aPosition){
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
        System.out.println("Set next position: ");
        P1 = input.nextLine();
      }else{
        if(P2.equals("")){
          System.out.println("Set next position: ");
          P2 = input.nextLine();
        }else{
          if(P3.equals("")){
              System.out.println("Set next position: ");
              P3 = input.nextLine();
          }
        }
      }


        System.out.println("Set another position(Y/N): ");
        check = input.nextLnine();
        check = check.toLowerCase();
        counter = counter + 1;
    }
    }
/* Method to try unlocking the lock */
  public void unlock( ){
    
  }
/* Method to check if the lock is unlocked. Return true if the
lock is currently open. */
  public boolean isOpen( ){
    …
  }
/* Method to close the lock */
  public void lock( ){
    …
  }


private String Combination;
private String P1;
private String P2;
private String P3;
}
