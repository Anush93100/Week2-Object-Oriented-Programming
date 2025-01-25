package com.assistedProblem.AnimalHierarchy;

//creating subClass: Dog extending Animal
class Dog extends Animal {

    Dog(String name, int age){
        super(name,age);
        //super.setName(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Dog is making Sound: Woof, Woof ");
    }
}
