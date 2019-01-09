import java.util.*;

/**
	Bank class test
*/

public class BankTest{
	public static void main(String[] args) {
		bankls firstBank=new bankls();
		bankls secondBank=new bankls();
		firstBank.addAccount(100);
		firstBank.addAccount(200);
		firstBank.addAccount(300);
		firstBank.addAccount(400);
		System.out.println("First Bank Accounts");
		firstBank.displayAccounts();
		System.out.println("First Bank Accounts updated");
		firstBank.deposit(0,500);
		firstBank.withdraw(1,100);
		
		firstBank.displayAccounts();

	}
}
