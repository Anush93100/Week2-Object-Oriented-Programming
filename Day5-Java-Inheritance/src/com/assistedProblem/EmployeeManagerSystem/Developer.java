package com.assistedProblem.EmployeeManagerSystem;

//creating subClass: Developer extends Employee
class Developer extends Employee{

    //attributes: programmingLanguage
    protected String programmingLanguage;

    Developer(String name,int id, double salary, String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void displayDetails(){
        System.out.println("\n----Developer Details----");
        System.out.println("Name      :" + this.name);
        System.out.println("ID        :" + this.id);
        System.out.println("Salary    :" + this.salary + "$");
        System.out.println("Prog. Lang:" + this.programmingLanguage);
    }

    //getter and setter
    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage=programmingLanguage;
    }

    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
}

