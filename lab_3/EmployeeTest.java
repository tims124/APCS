
import java.util.Scanner;
public class EmployeeTest{
	public static void main(String[] args){
	
	Employee Ki = new Employee("Ki", "Penetration Tester", 17, 100000.00); //sets employee 1
	Employee Mike = new Employee("Mike", "Material Science", 17, 100000.00);//sets employee 2
	
	
	System.out.print("Employee 1: ");
	Ki.printEmployee(); //prints employee info
	Ki.empAge(18); //sets new age
	System.out.println("Ki's age is: "+Ki.getEmpAge()); //gets current age
	
	System.out.print("Emplyee 2: ");
	Mike.printEmployee(); //prints employee info
	System.out.println("Mike's new job is IT");
	Mike.empJob("IT"); //sets new job
	System.out.println("Mike's new salary is $50000.00");
	Mike.empSalary(50000.00); //sets new salary
	System.out.println("Mike's salary is: $"+Mike.getEmpSalary()); //returns and prints salary
	System.out.println("Mike's job is: "+Mike.getEmpJob()); // returns and prints job
	
	
		
		
		
	}
}