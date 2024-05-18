package com.javaProject;

// this is example of method overriding which is also an example of
// run time polymorphism (dynamic polymorphism)
// in method overriding child class provides a specific implementation
// of method(s) already present in parent class
// The method to be called is resolved at runtime
class ParentClass{
    public void method(){
        System.out.println("This is parent class method");
    }
}

class ChildClass extends ParentClass{
    @Override
    public void method(){
        System.out.println("This is child class method which is overriding parent class method");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        ParentClass childObj = new ChildClass();
        childObj.method();
    }
}
