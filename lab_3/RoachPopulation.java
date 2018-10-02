
public class RoachPopulation{
	public RoachPopulation(int p){
		population = p;
	}

	public int waitPeriod(){//doubles population
	this.population = population * 2;
	return population;
	}
	
	public int spray(){//reduces population by 10%
	int percent= population / 10;
	this.population = population - percent;
	return population;
	}
	
	public int getRoaches(){//returns current number of roaches
	return population;
	}
	
	private int population;
}