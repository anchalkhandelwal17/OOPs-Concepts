package com.javaProject;

import java.util.ArrayList;

class EmployeeDataClass{
    String name;
    int age;

    public EmployeeDataClass(){
        this("dummy", 100);
    }
    public EmployeeDataClass(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class LambdaExpression {
    public static void main(String[] args){
        ArrayList<EmployeeDataClass> list = new ArrayList<>();
        list.add(new EmployeeDataClass("a", 40));
        list.add(new EmployeeDataClass("b", 35));
        list.add(new EmployeeDataClass("c", 21));

        // sorting the list using lambda expression in ascending order on the basis of employee age
        list.sort((x, y) -> x.age - y.age);


        for(EmployeeDataClass e : list){
            System.out.println("Data : " + "{" + e.name + " " + e.age + "}");
        }
    }
}
