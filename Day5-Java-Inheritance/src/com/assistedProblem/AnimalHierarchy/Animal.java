package com.assistedProblem.AnimalHierarchy;
//creating Superclass: Animal
class Animal{

    //attributes: name, age
    protected String name;
    protected int age;

    //parameterized constructor
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    //creating makeSound method
    public void makeSound(){
        System.out.println("Animal is making Sound.");
    }

    //setter methods
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    //getter methods
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}