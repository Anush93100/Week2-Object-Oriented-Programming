package com.assistedProblem.EmployeeManagerSystem;

//creating BaseClass: Employee
class Employee{

    //attributes: name, id, salary
    protected String name;
    final protected int id;
    protected double salary;

    //parameterized constructor
    Employee(String name,int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    //method to displayDetails
    public void displayDetails(){
        System.out.println("\n----Employee Details----");
        System.out.println("Name   :" + this.name);
        System.out.println("ID     :" + this.id);
        System.out.println("Salary :" + this.salary + "$");
    }

    //setter methods
    public void setName(String name){
        this.name=name;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    //getter methods
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getDouble(){
        return salary;
    }
}
