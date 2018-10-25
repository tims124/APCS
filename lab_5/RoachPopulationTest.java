//start: 10
//wait -> spary -> display -> repeat 3 times
import java.util.Scanner;
public class RoachPopulationTest{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.println("This program keeps track of a roach population. You");
	System.out.println("will specify a starting population and then number of");
	System.out.println("waiting or spraying periods. Each spraying will");
	System.out.println("decrease the population by 10%. Each waiting period");
	System.out.println("will double the population.");

	System.out.print("What is the initial roach population? ");
	int RP = input.nextInt();

	RoachPopulation test = new RoachPopulation(RP);

	System.out.print("How many sprayings would you like? ");
	int spray = input.nextInt();
	test.spray(spray);

	System.out.println("The roach population is now "+test.getRoaches());

	System.out.print("How many waiting periods would you like? ");
	int wait = input.nextInt();
	test.waitPeriod(wait);

	System.out.println("The roach population is now "+test.getRoaches());



	}
}
