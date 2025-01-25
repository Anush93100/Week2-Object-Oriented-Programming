package employeemanagementsystem;

public class EmployeeManagementSystem1 {
    public static void main(String[] args) {
        PartTimeEmployee employee1 = new PartTimeEmployee("Anush Tenguriya", 120000, 101, "IT");
        employee1.displayDetails();
        employee1.calculateSalary();
        System.out.println("Department  :" +employee1.getDepartment());

        FullTimeEmployee employee2=new FullTimeEmployee("Ojas Johar", 150000,102,"IT");
        employee2.displayDetails();
        employee2.calculateSalary();
        System.out.println("Department  :" +employee2.getDepartment());
    }
}
