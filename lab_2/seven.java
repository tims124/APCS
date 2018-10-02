import java.util.Scanner;

public class seven{
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("This program converts milliseconds to hours, minutes, and seconds");
	System.out.print("Enter the number of milliseconds: ");
	int ms = input.nextInt();
	
	int h = ms / 3600000; //hours
	
	int hour = ms % 3600000 ;
	
	int m = hour / 60000; //minutes
	
	double minute = hour % 60000 ;
	
	double s = minute / 1000; //seconds
	
	System.out.println(h+" hours , "+m+" minutes, and "+s+" seconds ");
	}
}