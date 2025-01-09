package com.javaProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Human implements Comparable<Human>{
    String name;
    int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Human o){
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Human{id=" + age + ", name='" + name + "'}";
    }

}

public class Comparable_interface {
    public static void main(String[] args) {
        List<Human> list = Arrays.asList(new Human("human1", 20),
                                        new Human("human2", 10),
                                        new Human("human3", 30),
                                        new Human("human4", 40));

        Collections.sort(list);
        System.out.println(list);
    }
}
