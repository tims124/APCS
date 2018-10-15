import java.util.Scanner;
public class CombinationTest{
	public static void main(String[] args){

	String a = "CPS";
	Combination test = new Combination(a);

	Scanner input = new Scanner(System.in);
	System.out.print("Would you like to try to open a combination lock?(Y/N) ");
	String check = input.nextLine();

	check = check.toLowerCase();
	if(check.equals("y")){
		while(true){
			test.setPosition();





		}
	}

	}
}
