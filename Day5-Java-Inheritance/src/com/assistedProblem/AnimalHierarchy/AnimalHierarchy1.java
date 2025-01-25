package com.assistedProblem.AnimalHierarchy;

public class AnimalHierarchy1{
    public static void main(String[] args){

        //creating animal class
        Animal animal=new Animal("Elephant",28);
        System.out.println("\nAnimal name: " + animal.getName());
        System.out.println("Animal age : " + animal.getAge());
        animal.makeSound();

        Dog dog=new Dog("Dogesh", 12);
        System.out.println("\nDog name: " + dog.getName());
        System.out.println("Dog age : " + dog.getAge());
        dog.makeSound();

        System.out.println("\nChanging age of Dog by using parent class method in child class");
        System.out.println("Old Age: " + dog.getAge());
        dog.setAge(13);
        System.out.println("New Age: " + dog.getAge());

        Cat cat=new Cat("Billa", 9);
        System.out.println("\nCat name: " + cat.getName());
        System.out.println("Cat age : " + cat.getAge());
        cat.makeSound();

        Bird bird =new Bird("ChiChi",2);
        System.out.println("\nBird name: " + bird.getName());
        System.out.println("Bird age : " + bird.getAge());
        bird.makeSound();
    }
}