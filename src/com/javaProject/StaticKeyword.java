package com.javaProject;

class StaticExample{
    // static methods and variables belongs to the class itself
    // rather than belonging to any object of the class , and we can use them
    // without creating the object of the class

    // static variable
    static String name;
    int age;

    // static method
    public static void greet(){
        System.out.println("Hello " + name);

        // if we want to access age variable inside this static method
        // which is a non-static variable , then we cannot directly access it
        // if we try to access it we will get compile error
        // in order to access age variable first we have to create object of the class
        // and using that object we can access that age variable inside this static method

        // all the variables and methods which are static we can directly access them inside
        // this method, without having to create instance of the class
    }

}
public class StaticKeyword {
    public static void main(String[] args){
//        StaticExample.name = "Person1";
//        StaticExample.greet();

        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        obj1.name = "Person1";
        obj2.greet();

    }
}
