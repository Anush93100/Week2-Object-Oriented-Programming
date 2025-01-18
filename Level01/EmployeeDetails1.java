
//Creating employee class
class Employee{
	//creating aname,id,and salary attributes
	private String name;
	private int id;
	private double salary;
	
	//parameterized constructor
	Employee(String name, int id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	//creating method to display the employee details
	public void displayDetails(){
		System.out.println("-------Employee Details-------");
		System.out.println("Name        : " + name);
		System.out.println("Employee ID : " + id);
		System.out.println("Salary      : " + salary + "$");
		System.out.println("------------------------------");
	}
}

//Creating EmployeeDetails class to check and run the program
public class EmployeeDetails1{
	public static void main(String[] args){
		Employee employee1=new Employee("Anush Tenguriya", 12, 400000);
		employee1.displayDetails();
	}
}