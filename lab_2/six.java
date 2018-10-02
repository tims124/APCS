import java.util.Scanner;

public class six{
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("This program takes four integers and finds the max");
	System.out.print("Enter first integer : ");
	int val1 = input.nextInt();
	System.out.print("Enter second integer: ");
	int val2 = input.nextInt();
	System.out.print("Enter third integer : ");
	int val3 = input.nextInt();
	System.out.print("Enter fourth integer: ");
	int val4 = input.nextInt();

	System.out.println("Max: "+Math.max(val1,Math.max(val2,Math.max(val3,val4))));
	
	
	
	}
}