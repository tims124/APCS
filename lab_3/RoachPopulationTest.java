//start: 10
//wait -> spary -> display -> repeat 3 times

public class RoachPopulationTest{
	public static void main(String[] args){
	int RP = 10;
	RoachPopulation kitchen = new RoachPopulation(RP);

	int a = 0;
	while(a < 3){
	a = a + 1;
	System.out.println("The initial population of roaches in the kitchen is "+RP);
	System.out.println("The roach population doubles...");
	kitchen.waitPeriod();
	System.out.println("Insecticide is used...");
	kitchen.spray();
	System.out.println("Number of Roaches after "+a+" cycle(s): "+kitchen.getRoaches());

	}



	}
}
