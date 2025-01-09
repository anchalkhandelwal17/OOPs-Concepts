package com.javaProject;

// abstract final class A{}  // uncommenting this line will give compile error as
// abstract classes cannot be declared final

// using abstract classes also we can't achieve multiple inheritance in java
abstract class A{
    // we can have constructors in abstract classes
    public A(){
        System.out.println("Constructor of A");
    }

    // abstract methods
    abstract void method1();
    abstract void method2();

    public static void method3(){
        System.out.println("abstract class A static method");
    }

    // this is a final method it can't be overridden
    final void method4(){
        System.out.println("abstract class A final method that can't be overridden");
    }
}

// As class B is extending abstract class A, so it has to override every abstract method
// present in it, if we are not overriding every abstract method present in class A
// then we have to declare class B also as abstract, otherwise we will get compile error

// if the abstract class contains concrete methods also, then it is up to as if we want to
// override them or not, but for sure we have to override every abstract method in the class
// which is extending the abstract class
class B extends A{
    public B(){
        System.out.println("Constructor of B");
    }
    @Override
    void method1(){
        System.out.println("This is a method1 which is overriding abstract class A method1");
    }

    @Override
    void method2(){
        System.out.println("This is a method2 which is overriding abstract class A method2");
    }

}

public class AbstractClass {
    public static void main(String[] args){
//        A a = new A();  // Uncommenting this line will give compile error
        // as abstract class can't be instantiated
        B b = new B();
        b.method1();
        b.method2();
        b.method3();
        A.method3();
//        A.method4();
    }
}
