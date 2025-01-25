package com.assistedProblem.AnimalHierarchy;

//creating subClass: Bird extanding Animal
class Bird extends Animal {

    Bird(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println("Bird is making Sound: Chirps, Chirps");
    }
}
