package com.javaProject;

class Employee{
    // Instance variables
    String name;
    int age;
    long salary;

    // Default constructor
    public Employee(){
        // during object creation if no parameters are passed inside the constructor
        // then this constructor will be called
        // but using "this" keyword we can call a constructor from this constructor
        // which takes three parameters and set the employee details to some dummy data
//        this("Dummy",19,100);

        // if we pass two parameters then it will call constructor which
        // takes two parameters
        this("Dummy",19);

        // if we try to call a constructor which takes one parameter
        // but as such any constructor do not even exist in our program
        // then we will get error
//        this("Dummy");
    }

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Parameterized Constructor
    public Employee(String name, int age, long salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // method to print employee data
    public void printData(){
        System.out.println(this.name + " " + this.age + " " + this.salary);
    }

}
public class Constructor {
    public static void main(String[] args){

        Employee e1 = new Employee("Sundar",99, 1000000000); // object 1
        Employee e2 = new Employee("Satya",100, 10000000);  // object 2
        Employee e3 = new Employee();   // object 3
        e1.printData();
        e2.printData();
        e3.printData();
    }
}
