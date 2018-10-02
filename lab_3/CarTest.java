import java.util.Scanner;

public class CarTest{
	
	public static void main(String[] args){
		Car car1 = new Car(27000,2003); //Sets car price and year
		System.out.println("The price is: $"+car1.getPrice()+"\nThe model year is: " +car1.getYear()); // Returns year and price
		
		Scanner in = new Scanner(System.in); //Sets a new price
		System.out.print("New Price:");
		int a = in.nextInt();
		car1.setPrice(a);
		
		System.out.println("The new price is " +car1.getPrice()); //returns the new price
		
	}
}