package employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department{

    private String department;

    public FullTimeEmployee(String name, double salary, int employeeId, String department) {
        super(name, salary, employeeId);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void assignDepartment(String department) {
        this.department=department;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Full Time Employee works on " + department + " department");
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary of Part Time employee is: " + getSalary());
    }
}
