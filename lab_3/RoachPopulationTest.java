//start: 10 
//wait -> spary -> display -> repeat 3 times

public class RoachPopulationTest{
	public static void main(String[] args){
	RoachPopulation kitchen = new RoachPopulation(10);
	
	int a = 0;
	while(a < 3){
	a = a + 1;
	kitchen.waitPeriod();

	kitchen.spray();
	System.out.println("Number of Roaches after "+a+" cycle(s): "+kitchen.getRoaches());

	}
		
		
		
	}
}