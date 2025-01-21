
//craeting Employee class
class Employee{
	static String companyName;
	String name;
	final int id;
	String designation;
	static int totalEmployee=0;
	
	//constructor
	Employee(String name,int id, String designation){
		this.companyName="Capgemini";
		this.name=name;
		this.id=id;
		this.designation=designation;
		totalEmployee++;
	}
	
	//method to display total employee
	public static void displayTotalEmloyee(){
		System.out.println("\nTotal employees :" +totalEmployee);
	}
	
	//method to display details
    public static void displayDetails(Employee employee){
	    if(employee instanceof Employee){
		    System.out.println("\n-----Employee Details-----");
			System.out.println("Employee Name   :" + employee.name);
			System.out.println("Employee ID     :" + employee.id);
			System.out.println("Designation     :" + employee.designation);
			System.out.println("Company Name    :" + Employee.companyName);
	    }else{
			System.out.println("Given Object is not an instance of Employee class");
		}
	}
}

//creating Employee management System
public class EmployeeManagementSystem3{
	public static void main(String[] args){
		
		Employee employee2=new Employee("Ojas Johar",101,"Manager");
		Employee.displayDetails(employee2);
		
		Employee employee1=new Employee("Anush Tenguriya",102,"Employee");
		Employee.displayDetails(employee1);
		
		Employee employee3=new Employee("Om Tamrakar",103,"Employee");
		Employee.displayDetails(employee3);
		
		Employee employee4=new Employee("Sejal Chouhan",104,"Employee");
		Employee.displayDetails(employee4);
		
		Employee.displayTotalEmloyee();
	}
}