package com.javaProject;

//There are four access modifiers in java-

class Modifier{

    //1. public => The public access modifier makes the class members accessible from anywhere be it from
    // same class, sub-class, same package, different package, etc.
    public int a;

    public void method1(){

    }

    //2. private => The private access modifier makes the class members accessible only within its own class.
    private int b;

    private void method3(){

    }


    //3. protected => The protected access modifier makes the class members accessible in the same class,
    // sub-class, same package, and in different packages it can only be used when the class in
    // different package is extending the class in which the members are defined with the protected
    // modifier.
    protected int c;

    protected void method2(){

    }

    //4. default => if we do not write any modifier for a class member them it is considered as
    // default modifier. default  modifier makes the class members accessible in same class, sub-class,
    // and same package only.
    int d;

    void method4(){

    }
}
public class AccessModifiers {
    public static void main(String[] args){

    }
}
