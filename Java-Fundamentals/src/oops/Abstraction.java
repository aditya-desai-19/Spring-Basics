package oops;/*
Why abstraction?
-> To hide certain details of class
 */

abstract class Animal {
    abstract void animalSound();

    protected void move() {
        System.out.println("Moving");
    }
}

class Dog extends Animal {

    void animalSound() {
        System.out.println("Bow bow");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.animalSound();
        d.move();
    }
}
