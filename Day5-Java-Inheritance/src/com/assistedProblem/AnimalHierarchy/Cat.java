package com.assistedProblem.AnimalHierarchy;

//creating subClass: Cat extending Animal
class Cat extends Animal {

    Cat(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println("Cat is making Sound: Meow, Meow");
    }
}
