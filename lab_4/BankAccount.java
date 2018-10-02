//Bank Account Class

public class BankAccount{
	public BankAccount(double b, double r){
	balance = b;
	annualRate = r;
	}

	//adds to the balance of the object
	public double deposit(double dep){
		if (dep > 0){
		this.balance = balance + dep;
		return balance;
	}else{
		System.out.println("Can't deposit a negative ammount of money.");
		return balance;
	}
	}

	//subtracts from the balance of the object
	public double withdraw(double draw){
		if (draw > 0){
		this.balance = balance - draw;
		return balance;
	}else{
		System.out.println("Can't withdraw a negative ammount of money.");
		return balance;
	}
	}

	//adds the interest rate to the balance of the object
	public double addInterest(){
		double per = annualRate / 100 ;
		this.balance = (per * balance) + balance;
		return balance;
	}

	//returns the annual interest rate
	public double getInterest(){
		return annualRate;
	}

	//returns the current balance
	public double getBalance(){
		return balance;
	}

	//prints the balance
	public double printBalance(){
		System.out.println(balance);
		return balance;
	}

	private double annualRate;
	private double balance;
}
