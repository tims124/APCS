
public class Quadratic{
	public Quadratic(double inA, double inB, double inC){
	a = inA;
	b = inB;
	c = inC;
	checkRoot = 0;
	checkhasSolutions = 0;
	}

	public void findRoots(){
		boolean findRoots = this.hasSolutions;
		if(findRoots){
			System.out.println("There are no real roots");
		}else{
			this.root1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c)) / (2*a);
			this.root2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c)) / (2*a);
	return;
		}
	}

	public Boolean hasSolutions(){
	this.checkRoot = checkRoot + 1;
	double d = Math.pow(b,2) - 4*a*c;
		if (d<0){
			return false;
		}else{
			this.checkhasSolutions = 1;
			return true;
		}
	}

	public void displayRoots(){
		if (checkRoot != 2){
			System.out.println("Please run findRoots() and hasSolutions() first");
			return;
		}else{
		if (checkhasSolutions != 1){
			System.out.println("There are no real roots");
		}else{
			System.out.println("The roots are: " +root1+" and "+root2);
		return;
		}
	}}



	private double a;
	private double b;
	private double c;
	private int checkRoot;
	private int checkhasSolutions;
	private double root1;
	private double root2;
}
