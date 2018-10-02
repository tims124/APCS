

public class Employee{
	public Employee(String n, String j, int a, double s){
		name = n ;
		job = j ;
		age = a ;
		salary = s ;
		}
	/* Assign the age of the Employee to the variable age.*/
	public void empAge(int empAge){
	this.age = empAge;
	return;
	}
	
	/* Assign the designation to the attribute job.*/
	public void empJob(String empJob){
	this.job = empJob;
	return;
	}
	/* Assign the salary to the attribute salary.*/
	public void empSalary(double empSalary){
	this.salary = empSalary;
	return;
	}
	
	/* Print the Employee details: name, job, age and salary */
	public void printEmployee(){
	System.out.print(name);
	System.out.print(", "+job);
	System.out.print(", "+age);
	System.out.println(", $"+salary);
	return;
	}
	
	
	/* Get the employee salary */
	public double getEmpSalary(){
	return salary;
	}
	
	/* Get the employee age */
	public int getEmpAge(){
	return age;
	}
	
	/* Get the employee job */
	public String getEmpJob(){
	return job;
	}
	
	
	//shhhhhh
	private String name;
	private String job;
	private int age;
	private double salary;
}