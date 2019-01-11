
import java.util.ArrayList;
public class bankls{
  public bankls(){
    test = new ArrayList<BankAccount>();
  }

  public void addAccount(double initialBalance){
    BankAccount a = new BankAccount(initialBalance);
    test.add(a);
  }

  public void displayAccounts(){
    System.out.println("# | Balance($)");
    for(int accNum = 0; accNum< test.size(); accNum++){
      System.out.println(accNum+" |  " +test.get(accNum).printBalance());
    }
  }

  public void deposit(int account, double amount){
    test.get(account).deposit(amount);
  }

  public void withdraw(int account, double amount){
    test.get(account).withdraw(amount);
  }

  public double getBalance(int account){
    return test.get(account).printBalance();
  }


  ArrayList<BankAccount> test ;
}
