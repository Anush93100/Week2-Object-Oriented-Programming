import java.util.ArrayList;
import java.util.List;

class Company{
	private String companyName;
	private List<Department> departments;
	
	Company(String companyName){
		this.companyName=companyName;
		departments=new ArrayList<>();
	}
	
	public void createDepartment(Department department){
		if(!departments.contains(department)){
			departments.add(department);
		}
	}
	
	public void deleteCompany(){
		System.out.println("Deleting the Company: " + companyName);
		//for(Department d: departments){
		//	d.deleteEmployees();
		//}
		departments.clear();
		System.out.println("All department deleted.");
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public List<Department> getDepartments(){
		return departments;
	}
}

class Department{
	private String departmentName;
	private List<Employee> employees;
	
	Department(String departmentName){
		this.departmentName=departmentName;
		employees=new ArrayList<>();
	}
	
	public void addEmployee(Employee employee){
		if(!employees.contains(employee)){
			employees.add(employee);
		}
	}
	
	public List<Employee> getEmployees(){
		return employees;
	}
	
	public String getDepartmentName(){
		return departmentName;
	}
}

class Employee{
	private String employeeName;
	
    Employee(String employeeName){
		this.employeeName=employeeName;
		
	}
	
	public String getEmployeeName(){
		return employeeName;
	}

}

public class CompanyModel3{
	public static void main(String[] args){
		
		Employee employee1=new Employee("Anush Tenguriya");
		Employee employee2=new Employee("Ojas Johar");
		Employee employee3=new Employee("Om tamrakar");
		Employee employee4=new Employee("Sejal Chouhan");
		
		Employee employee5=new Employee("Raj Chandanan");
		Employee employee6=new Employee("Manish Patel");
		Employee employee7=new Employee("Arpita Gautam");
		Employee employee8=new Employee("Shubhanshi Verma");
		Employee employee9=new Employee("Rishav Raj");
		
		Department department1=new Department("IT Department");
		Department department2=new Department("Development department");
		
		Company company=new Company("Capgemini");
		
		department1.addEmployee(employee1);
		department1.addEmployee(employee2);
		department1.addEmployee(employee3);
		department1.addEmployee(employee4);
		
		department2.addEmployee(employee5);
		department2.addEmployee(employee6);
		department2.addEmployee(employee7);
		department2.addEmployee(employee8);
		department2.addEmployee(employee9);
	
	    company.createDepartment(department1);
		company.createDepartment(department2);
		
		System.out.println("\nCompanay name: " + company.getCompanyName());
		for(Department d: company.getDepartments()){
			System.out.println("\nDepartment name: " + d.getDepartmentName());
			System.out.println("Following employees work in this department.");
			for(Employee e: d.getEmployees()){
				System.out.println(e.getEmployeeName());
			}
		}
		
		System.out.println();
		company.deleteCompany();
	}
}