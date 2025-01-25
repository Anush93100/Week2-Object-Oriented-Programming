package com.assistedProblem.EmployeeManagerSystem;

//creating subClass: Intern extends Employee
class Intern extends Employee{

    //attributes: duration
    protected int duration;

    Intern(String name,int id, double salary, int duration){
        super(name,id,salary);
        this.duration=duration;
    }

    @Override
    public void displayDetails(){
        System.out.println("\n----Developer Details----");
        System.out.println("Name      :" + this.name);
        System.out.println("ID        :" + this.id);
        System.out.println("Salary    :" + this.salary + "$");
        System.out.println("Duration  :" + this.duration + " months");
    }

    //getter and setter
    public void setDuration(int duration){
        this.duration=duration;
    }

    public int getDuration(){
        return duration;
    }
}