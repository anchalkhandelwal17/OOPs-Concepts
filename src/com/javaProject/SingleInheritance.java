package com.javaProject;


class Vehicle{
    int speed;
    public void applyBrake(){
        System.out.println("Applying Brake...");
    }
    public void incrementSpeed(){
        System.out.println(this.speed++);
    }
}

// This is example of single Inheritance in which a subclass is
// inheriting the features of one superclass
class Car extends Vehicle{

    public void pressHorn(){
        System.out.println("Honnnnkkkkkk");
    }
}

public class SingleInheritance {
    public static void main(String[] args){

        Car Audi = new Car();
        Audi.incrementSpeed();
        Audi.incrementSpeed();
        Audi.incrementSpeed();
        Audi.pressHorn();
        Audi.applyBrake();

    }
}
