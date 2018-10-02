public class SodaCan{
	public SodaCan(double r, double h){
		radius = r;
		height = h;
	}
	
	public void getSurfaceArea(){
	double pt1 = 2 * radius * height * Math.PI ;
	double pt2 = 2 * Math.PI * Math.pow(radius,2); 
	double SA = pt1 + pt2;
	System.out.println(SA);
	return;
	}
	
	public void getVolume(){
	double V = Math.PI * Math.pow(radius,2) * height;
	System.out.println(V);
	return;
	}
	
	private double radius;
	private double height;
	
}