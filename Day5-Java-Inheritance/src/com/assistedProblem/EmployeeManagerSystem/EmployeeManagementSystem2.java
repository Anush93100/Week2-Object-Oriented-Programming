package com.assistedProblem.EmployeeManagerSystem;

public class EmployeeManagementSystem2{
    public static void main(String[] args){

        Employee employee =new Employee("Anush tenguriya",101,100000);
        employee.displayDetails();

        Manager manager=new Manager("Ojas Johar",102,90000,2);
        manager.displayDetails();

        System.out.println("\nChanging team Size and salary of Manager.");
        manager.setTeamSize(4);
        manager.setSalary(100000);
        manager.displayDetails();

        Developer developer=new Developer("Om Tamrakar",103,80000,"Java");
        developer.displayDetails();

        Intern intern=new Intern("Sejal Chouhan",104,30000,6);
        intern.displayDetails();

    }
}