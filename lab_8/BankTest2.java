import java.util.*;

/**
	Bank class test
*/

public class BankTest2{
	public static void main(String[] args) {
	 	bankls firstBank=new bankls();
		bankls secondBank=new bankls();
		firstBank.addAccount(100);
		firstBank.addAccount(200);
		firstBank.addAccount(300);
		firstBank.addAccount(400);
		System.out.println("First Bank Accounts");
		firstBank.displayAccounts();
		System.out.println();
		secondBank.addAccount(1000);
		secondBank.addAccount(1000);
		secondBank.addAccount(1000);
		secondBank.addAccount(2000);
		System.out.println("Second Bank Accounts");
		secondBank.displayAccounts();
		System.out.println();
		secondBank.deposit(2,700);
		System.out.println("Second Bank Accounts after deposit");
		secondBank.displayAccounts();
		System.out.println();
		secondBank.withdraw(1,200);
		System.out.println("Second Bank Accounts after withdrawal");
		secondBank.displayAccounts();
		System.out.println();
		System.out.println("The balance in Second Bank, Account number 3 is "+secondBank.getBalance(3));
	}
}
