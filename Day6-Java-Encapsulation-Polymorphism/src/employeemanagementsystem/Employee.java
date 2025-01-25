package employeemanagementsystem;

abstract class Employee {
    private final int employeeId;
    private String name;
    private double salary;

    public Employee(String name, double salary, int employeeId) {
        this.name = name;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    abstract public void calculateSalary();

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("-----Employee Details-----");
        System.out.println("Name        :" + name);
        System.out.println("Employee ID :" + employeeId);
        System.out.println("Salary      :" + salary);
    }
}
