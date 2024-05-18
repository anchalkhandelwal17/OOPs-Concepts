package com.javaProject;

class EmployeeClass{
    String name;
    int age;
    long salary;
    String address;

    // this is an example of constructor overloading
    // in which we can have many constructor in a class
    // each with a different parameter list
    // this allows for the creation of objects in different ways

    // this is a default constructor which do not take any parameters
    public EmployeeClass(){

    }
    // the below ones are all parameterized constructor
    // each taking different number of parameters

    public EmployeeClass(String name, int age){
        this.name = name;
        this.age = age;
    }

    public EmployeeClass(String name, int age, long salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public EmployeeClass(String name, int age, long salary, String address){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args){

        EmployeeClass e1 = new EmployeeClass("Francisco",25);
        EmployeeClass e2 = new EmployeeClass("Francisco",25,9876543);
        EmployeeClass e3 = new EmployeeClass("Francisco",25, 9876543, "France");
    }
}
