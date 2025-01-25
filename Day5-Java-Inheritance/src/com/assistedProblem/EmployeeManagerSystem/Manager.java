package com.assistedProblem.EmployeeManagerSystem;

//creating subClass: Manager extends Employee
class Manager extends Employee{

    //attributes: teamSize
    protected int teamSize;

    Manager(String name,int id, double salary, int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }

    @Override
    public void displayDetails(){
        System.out.println("\n----Manager Details----");
        System.out.println("Name      :" + this.name);
        System.out.println("ID        :" + this.id);
        System.out.println("Salary    :" + this.salary + "$");
        System.out.println("Team Size :" + this.teamSize);
    }

    //getter and setter
    public void setTeamSize(int teamSize){
        this.teamSize=teamSize;
    }

    public int getTeamSize(){
        return teamSize;
    }
}