//lab 2 pt 3; Uses user input to find area and circumference of a circle and
//Volume and surface area of a sphere

import java.util.Scanner;

public class three{
	public static void main(String[] args){
		System.out.println("This program asks for a radius"); 
		System.out.println("and finds the area and circumference of a circle with that radius");
		System.out.println("as well as the volume and surface area of a sphere with that radius");
				
		//vars
		double Radius ;
		double pi	  ;
		
		//new input
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.print("Enter radius:");	
		Radius = input.nextDouble();
		System.out.println("Radius = " +Radius);
		
		//pi=PI(irrelevent)
		pi = Math.PI;
		
		//math
			//area
			System.out.println("Cirlce area="+(pi * Math.pow(Radius, 2)));
			//Circumference
			System.out.println("Circle Circumference="+(2 * pi * Radius));
		
			//volume
			System.out.println("Sphere Volume="+((4.0 / 3) * pi * Math.pow(Radius, 3)));
			//Surface Area
			System.out.println("Sphere Surface Area=" +(4 * pi * Math.pow(Radius, 2)));
		
		
		
	}
}