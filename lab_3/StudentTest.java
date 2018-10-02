


public class StudentTest{
	public static void main(String[] args){
	
	Student ki = new Student("Ki",276,3);
	System.out.println("Ki's total test score is: "+ki.getTotalScore());
	System.out.println(ki.getName()+"'s average test score is: "+ki.getAverageScore());
	ki.addQuiz(98);
	System.out.println("Ki's total test score is now: "+ki.getTotalScore());
	
	System.out.println(ki.getName()+"'s new average test score is: "+ki.getAverageScore());
	}
}