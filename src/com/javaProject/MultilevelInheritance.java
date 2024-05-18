package com.javaProject;

class Vehicle2{
    int speed;
    public void applyBrake(){
        System.out.println("Applying Brake...");
    }
    public void incrementSpeed(){
        System.out.println(this.speed++);
    }
}

class Car2 extends Vehicle2{

    public void pressHorn(){
        System.out.println("Honkkkkk Honkkkkk");
    }
}
// this is example of multilevel inheritance
// where Ferrari class is derived from Car2 class and Car2 class is derived from Vehicle class
// Parent -> Child -> GrandChild
class Ferrari extends Car2{

    public void displayModelInfo(){
        System.out.println("Ferrari 296 GTS");
    }

    public void displayTopSpeed(){
        System.out.println("Ferrari 296 GTS top speed is 330 kmph");
    }

    @Override
    public void incrementSpeed(){
        this.speed = 250;
        System.out.println(this.speed);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args){

        Ferrari ferrari = new Ferrari();
        ferrari.incrementSpeed();
        ferrari.pressHorn();
        ferrari.applyBrake();
        ferrari.displayModelInfo();
        ferrari.displayTopSpeed();
    }
}
