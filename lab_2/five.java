//Lab 2 pt 5; converts number dates to written dates
import java.util.Scanner;

public class five{
	public static void main(String[] args){
	
	String mon = new String("January  Febuary  March    April    May      June     July     August   SeptemberOctober  November December     ");
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("This program takes a number between 1 and 12 ");
	System.out.println("and turns it into it's respective month");
	System.out.print("Enter a number from 1 through 12: ");
	int in = input.nextInt();

	if (12 >= in && in >= 1) {
	System.out.println("Month " +in +" is " +mon.substring((in-1)*9,in*9));
	}else{
		System.out.println(in +" is not a valid month");
	
	}
}
}