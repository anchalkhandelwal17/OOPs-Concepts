package com.javaProject;

// this is example of hierarchical inheritance
// in which one class is acting as a parent(super) class for many child(sub) classes
class Vehicle3{
    int speed;

    public Vehicle3(int speed){
        this.speed = speed;
    }
    public void topSpeed(){
        System.out.println(this.speed);
    }
}
class Car3 extends Vehicle3{

    public Car3(int speed){
        super(speed);
    }
}
class Bike extends Vehicle3{

    public Bike(int speed){
        super(speed);
    }
}
class Helicopter extends Vehicle3{

    public Helicopter(int speed){
        super(speed);
    }
}
class Bicycle extends Vehicle3{

    public Bicycle(int speed){
        super(speed);
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args){

        Car3 car = new Car3(180);
        Bike bike = new Bike(160);
        Helicopter helicopter = new Helicopter(250);
        Bicycle bicycle = new Bicycle(40);

        car.topSpeed();
        bike.topSpeed();
        helicopter.topSpeed();
        bicycle.topSpeed();

    }
}
