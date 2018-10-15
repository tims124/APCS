


public class StudentTest{
	public static void main(String[] args){

	Student ki = new Student("Ki",0);
	int counter = 0;
	System.out.println("Ki's total test score is: "+ki.getTotalScore());
	System.out.println(ki.getName()+"'s average test score is: "+ki.getAverageScore());


	while(counter < 3){

	double a = Math.floor(Math.random()*100);
	System.out.println("Ki got "+a+"% on a test");
	ki.addQuiz(a);


	System.out.println("Ki's total test score is now: "+ki.getTotalScore());
	System.out.println(ki.getName()+"'s new average test score is: "+ki.getAverageScore());

	counter = counter + 1;
	}
	}
}
