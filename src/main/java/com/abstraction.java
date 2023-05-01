package com;

public class abstraction {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.makeSound();
        animal2.makeSound();
    }
}

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public void makeSound(){
        System.out.println("Meow!");
    }
}
