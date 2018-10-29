
public class RoachPopulation{
	public RoachPopulation(int p){
		population = p;
		timer = 0;
	}

	public double waitPeriod(int n){//doubles population

	this.timer = 0;
	while(timer < n){
		this.population = this.population * 2;
		this.timer = this.timer + 1;
	}
		return population;
	}

	public double spray(int n){//reduces population by 10%

	this.timer = 0;
	while(timer < n){
		double percent= population / 10;
		this.population = this.population - percent;
		this.population = Math.floor(this.population);
		this.timer = this.timer + 1;
	}
		return population;
	}

	public double getRoaches(){//returns current number of roaches
		return population;
	}

	private double population;
	private int timer;
}
