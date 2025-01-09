package com.javaProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class HumanClass {

    String name;
    int age;

    public HumanClass(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Human{id=" + age + ", name='" + name + "'}";
    }
}

// implementing comparator by sorting on the basis of name
class NameBasedSorting implements Comparator<HumanClass> {

    @Override
    public int compare(HumanClass o1, HumanClass o2){
        return o1.name.compareTo(o2.name);
    }
}

// implementing comparator by sorting on the basis of age
class AgeBasedSorting implements Comparator<HumanClass> {

    @Override
    public int compare(HumanClass o1, HumanClass o2){
        return Integer.compare(o1.age, o2.age);
    }
}

public class Comparator_interface {
    public static void main(String[] args) {
        List<HumanClass> list = Arrays.asList(new HumanClass("h1", 5),
                                                new HumanClass("h2", 10),
                                                new HumanClass("h3", 15),
                                                new HumanClass("h4", 20),
                                                new HumanClass("h5", 25));


        System.out.println(list);
        Collections.sort(list, new NameBasedSorting());
        System.out.println("--------------List After sorting on the basis of names----------------");
        System.out.println(list);
        Collections.sort(list, new AgeBasedSorting());
        System.out.println("--------------List After sorting on the basis of age----------------");
        System.out.println(list);

        // instead of writing the different classes for sorting logic based upon mame and age
        // we can write anonymous comparator in a lambda function style

        Collections.sort(list, new Comparator<HumanClass>() {
            @Override
            public int compare(HumanClass o1, HumanClass o2) {
                int basisOnName = o1.name.compareTo(o2.name);
                if(basisOnName == 0){
                    return Integer.compare(o1.age, o2.age);
                }
                return basisOnName;
            }
        });

    }
}
