package com.javaProject;

//Some Advantages of Using Super Keyword
//Enables reuse of code
//Supports polymorphism
//Provides access to parent class behaviour
//Allows for customization of behaviour
//Facilitates abstraction and encapsulation

class Parent{

    int number = 1;
    public Parent(){
        System.out.println("Parent class constructor");
    }
    public void print(){
        System.out.println("Parent class method");
    }
}

class Child extends Parent{

    int number = 2;
    public Child(){
        // here parent class constructor is called using the super keyword
        // example of using super with constructor
        super();
        System.out.println("Child class constructor");
    }

    @Override
    public void print(){
        // example of using super with method
        // here parent class method print is called using the super keyword
        super.print();
        System.out.println("Child class method");

        // example of using super with instance variable
        // here parent class variable number is called using the super keyword
        System.out.println(super.number);
        System.out.println(number);
    }
}
public class SuperKeyword {
    public static void main(String[] args){
        Child child = new Child();
        child.print();
    }
}
