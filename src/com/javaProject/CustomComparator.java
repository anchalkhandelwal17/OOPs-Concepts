package com.javaProject;

import java.util.Arrays;
import java.util.Comparator;

class EmployeeData{
    String name;
    int age;

    public EmployeeData(){
        this("dummy", 100);
    }
    public EmployeeData(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class CustomComparatorClass implements Comparator<EmployeeData>{
    @Override
    public int compare(EmployeeData a , EmployeeData b){
        if(a.age == b.age) return 0;
        else if(a.age < b.age){
            return -1;
        }
        return 1;
    }
}

public class CustomComparator {
    public static void main(String[] args){
        EmployeeData e1 = new EmployeeData("employee1",28);
        EmployeeData e2 = new EmployeeData("employee2",34);
        EmployeeData e3 = new EmployeeData("employee3",21);
        EmployeeData e4 = new EmployeeData("employee4",40);

        EmployeeData[] data = {e1, e2, e3, e4};
//        Arrays.sort(data, new Comparator<EmployeeData>(){
//            @Override
//            public int compare(EmployeeData a , EmployeeData b){
//                if(a.age == b.age) return 0;
//                else if(a.age < b.age){
//                    return -1;
//                }
//                return 1;
//            }
//        });

        Arrays.sort(data, new CustomComparatorClass());
        for(EmployeeData e : data){
            System.out.println("Data : " + "{" + e.name + " " + e.age + "}");
        }
    }
}
