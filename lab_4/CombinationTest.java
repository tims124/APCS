import java.util.Scanner;
public class CombinationTest{
	public static void main(String[] args){

	String a = "CPS";
	Combination test = new Combination(a);

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a combination into the lock?(Y/N) ");
	String check = input.nextLine();
	check = check.toLowerCase();
	boolean ls = false;
	boolean x = false;


	if(check.equals("y")){
			test.setPosition();
	}

	System.out.print("Try to open the lock?");
	check = input.nextLine();
	check = check.toLowerCase();

	if(check.equals("y")){
		test.unlock();
 		x= test.isOpen();

	if(x){
		System.out.println("You unlocked the lock!");
		ls = true;
	}else{
		System.out.println("The lock is still locked.");
		ls = false;
	}
	}

	if(ls){
		System.out.print("Lock the Lock?(Y/N) ");
		String relock = input.nextLine();
		relock = relock.toLowerCase();

		if(relock.equals("y")){
			test.lock();
			System.out.println("The lock is locked.");
		}else{
			System.out.println("Have a good day.");
		}
	}


	}
}
