import java.util.Scanner;
public class BankTest
{
	
	public static void main(String[] args){
		//creates three "bank accounts"
		BankAccount MoeAccount = new BankAccount(100,5);
		BankAccount CurlyAccount =new BankAccount(120,2);
		BankAccount LarryAccount = new BankAccount(140,1);
				
		System.out.println("Current Account Balance: "+MoeAccount.getBalance());//Gets current balance of Moe's Account
		System.out.println("Current Account Interest Rate: "+CurlyAccount.getInterest()+"%");//Gets Current interest Rate of Curly's Account
		System.out.print("Account Balance After Interest: ");
		System.out.println(LarryAccount.addInterest());//Gets balance of Larry's account after interest
	
		//Asks the user to deposit money
		Scanner in = new Scanner(System.in);
		System.out.print("Deposit Ammount: ");
		double dep = in.nextDouble();
		MoeAccount.deposit(dep);
		System.out.println("New Account Balance: " +MoeAccount.getBalance());
		
		//Asks the user to withdraw money
		Scanner out = new Scanner(System.in);
		System.out.print("Withdraw Ammount: ");
		double draw = out.nextDouble();
		LarryAccount.withdraw(draw);
		System.out.println("New Account Balance: " +LarryAccount.getBalance());		
	}
}