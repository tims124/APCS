
public class RoachPopulation{
	public RoachPopulation(int p){
		population = p;
		timer = 0;
	}

	public int waitPeriod(int n){//doubles population

	this.timer = 0;
	while(timer < n){
		this.population = population * 2;
		this.timer = this.timer + 1;
	}
		return population;
	}

	public int spray(int n){//reduces population by 10%

	this.timer = 0;
	while(timer < n){
		int percent= population / 10;
		this.population = this.population - percent;
		this.timer = this.timer + 1;
	}
		return population;
	}

	public int getRoaches(){//returns current number of roaches
		return population;
	}

	private int population;
	private int timer;
}
