package com.javaProject;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args){

        Person p1 = new Person("James",30);
        Person p2 = new Person("Steve", 25);

        System.out.println(p1.getName() + " " + p1.getAge());

        p1.setName("Will");
        p1.setAge(28);
        System.out.println(p1.getName() + " " + p1.getAge());
    }
}
