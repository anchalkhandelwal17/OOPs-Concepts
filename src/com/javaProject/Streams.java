package com.javaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args){

        // filter all the odd numbers in a list using stream and print them
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        list.stream().filter(x -> x%2 == 1).forEach(e -> System.out.println(e));

//         double all the numbers in a list using stream and collect them in a set
//        Set<Integer> doubleOfNumbersList = list.stream().map(e -> e*e).collect(Collectors.toSet());
//        System.out.println(doubleOfNumbersList);

        // Now doubling all the numbers by using a method reference for all the values
        // instead of lambda function
        Set<Integer> doubleOfNumbersList = list.stream().map(Streams::square).collect(Collectors.toSet());
        System.out.println(doubleOfNumbersList);

    }

    public static Integer square(Integer num){
        return num * num;
    }
}
