
import java.util.Scanner;
public class SHTest{
	public static void main(String[] args){
		
	
	Scanner input = new Scanner(System.in);
		
	System.out.print("Enter the card notation: ");
	String a = input.nextLine();

	System.out.println(a);
	
	CardSH in = new CardSH(a);
	
	in.getDescription();



	}
}