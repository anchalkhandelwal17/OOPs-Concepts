package com.javaProject;

// this is example of method overloading which is also an example of
// compile time polymorphism (static polymorphism)
// in method overloading we can have multiple methods in the same class
// that have the same name but different parameters
//The method to be called is resolved at compile time
class Calculate{

    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
    public void add(){
        System.out.println("Provide at least two values to perform add operation");
    }
    public void add(int a){
        System.out.println("Please provide one more value to perform add operation");
    }

}
public class MethodOverLoading {
    public static void main(String[] args){
        Calculate object = new Calculate();
        System.out.println(object.add(2,3,4));
        object.add();
        object.add(1);
        System.out.println(object.add(2,3));
    }
}
