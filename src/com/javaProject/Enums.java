package com.javaProject;

enum Month{
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER,DECEMBER
}
public class Enums {
    public static void main(String[] args){

        Month month = Month.JANUARY;
//        System.out.println(month);

        // iterating over all the values in enum
        for(Month m : Month.values()){
            System.out.println(m);
        }
    }
}
