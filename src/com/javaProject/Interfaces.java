package com.javaProject;

// fields in java interfaces are public static final by default
// and methods in java interfaces are public abstract by default
// starting from java 8 we can have default as well as static methods
// in an interface

// interfaces are a way of achieving multiple inheritance in java
// since a class only extend one super class no matter what
// but it can implement any number of interfaces

interface VehicleInterface1{
    void start();
    void stop();
}

interface VehicleInterface2{
    void incSpeed();
    void decSpeed();
}

abstract class CarClass{
    abstract void pressHorn();
}
// The below class extends one class and implements two interfaces.
// showing the concept of multiple inheritance
class Tesla extends CarClass implements VehicleInterface1, VehicleInterface2{

    @Override
    public void start(){
        System.out.println("The car has started.");
    }
    @Override
    public void stop(){
        System.out.println("The car has stopped.");
    }
    @Override
    public void incSpeed(){
        System.out.println("Ok! Increasing speed");
    }
    @Override
    public void decSpeed(){
        System.out.println("Ok! Decreasing speed");
    }

    @Override
    public void pressHorn(){
        System.out.println("Honk");
    }
}

public class Interfaces {
    public static void main(String[] args){

        Tesla tesla = new Tesla();
        tesla.start();
        tesla.incSpeed();
        tesla.decSpeed();
        tesla.stop();
    }
}
