//lab 2 pt 2; random numbers sum & avg
//todo:
//format double to only print 3 digits past decimal point

import java.util.Random;

public class two{
	
	public static void main(String[] args){
		Random rand = new Random();
			//generates 4 random double numbers
			double a = 1 + (100 - 1) * new Random().nextDouble();
			double b = 1 + (100 - 1) * new Random().nextDouble();
			double c = 1 + (100 - 1) * new Random().nextDouble();
			double d = 1 + (100 - 1) * new Random().nextDouble();
			
			//prints 
			System.out.println("Random numbers:");
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			//random space for aesthetics
			System.out.println("");
			
			//prints sum & avg of the random values
			double sum = (a+b+c+d);
			System.out.println("Sum="+sum);
			double avg = sum / 4;
			System.out.println("Average="+avg);

	
	
	}
}