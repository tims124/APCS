
public class Student{
	public Student(String n, double t, double x){
		Name = n;
		TotalTestScore = t;
		NumberofTests = x;
	}
	
	public String getName(){
	return Name;
	}
	
	public void addQuiz(double Score){
	this.TotalTestScore = TotalTestScore + Score;
	this.NumberofTests = NumberofTests + 1;
	return; 
	}
	
	public double getTotalScore(){
	return TotalTestScore;
	}
	
	public double getAverageScore(){
	double avgScore = TotalTestScore / NumberofTests;
	return avgScore;
	}
	
	
	private String Name;
	private double TotalTestScore;
	private double NumberofTests;	
}