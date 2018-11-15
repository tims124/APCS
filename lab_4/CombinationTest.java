import java.util.Scanner;
public class CombinationTest{
	public static void main(String[] args){

	String a = "cps";
	Combination test = new Combination(a);
	Scanner input = new Scanner(System.in);
	String again = "";
	boolean ls = false;
	boolean x = false;
	boolean loop = true;

	while(loop){
		loop = false;
		System.out.println("Enter a combination into the lock ");
		test.setPosition();
		test.isOpen();
		if(test.isOpen() == true){
			System.out.println("The lock locked itself...");
			test.lock();
			loop = true;
		}
 	}


}
}
