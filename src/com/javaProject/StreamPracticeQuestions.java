package com.javaProject;

import java.util.*;
import java.util.stream.Collectors;

class EmployeeObj {

    String name;
    String dept;

    public EmployeeObj(String name, String dept){
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}
public class StreamPracticeQuestions {
    public static void main(String[] args){

//        1. Filter and Collect:
//
//        Given a list of integers, filter out the even numbers and collect them into a new list.
//                Input: List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Output: [2, 4, 6, 8, 10]

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> ans1 = numbers.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
//        System.out.println(ans1);


//        2. Map and Reduce:
//
//        Given a list of strings representing numbers, convert each string to an integer and find the sum of all the numbers.
//                Input: List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
//        Output: 15

//        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
//        int ans2 = numbers.stream().map(x -> Integer.valueOf(x)).reduce(0, (a, b) -> a + b);
//        System.out.println(ans2);

//        3. Group by:
//
//        Given a list of Employee objects with attributes name and department, group the employees by their department.
//                Input: List<Employee> employees = ... (Assume you have a list of Employee objects)
//        Output: A Map<String, List<Employee>> where the key is the department and the value is the list of employees in that department.

//        List<EmployeeObj> employeeObjList = new ArrayList<>();
//        employeeObjList.add(new EmployeeObj("Alex", "HR"));
//        employeeObjList.add(new EmployeeObj("Kobe", "R&D"));
//        employeeObjList.add(new EmployeeObj("Jim", "IT"));
//        employeeObjList.add(new EmployeeObj("Jack", "HR"));
//
//        Map<String, List<EmployeeObj>> employeesByDepartment = employeeObjList.stream()
//                .collect(Collectors.groupingBy(e -> e.getDept()));
//
//        System.out.println(employeesByDepartment);


//        4. Find First and Optional:
//
//        Given a list of strings, find the first string that starts with the letter 'A'. Return it as an Optional.
//        Input: List<String> names = Arrays.asList("John", "Alice", "Bob", "Anna");
//        Output: Optional.of("Alice")
//
//        List<String> names = Arrays.asList("John", "Alice", "Bob", "Anna");
//        Optional<String> optional = names.stream().filter(name -> name.startsWith("A")).findFirst();
//        System.out.println(optional);

//        FlatMap:
//
//        Given a list of lists of integers, flatten it into a single list containing all the integers.
//                Input: List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5), Arrays.asList(6, 7, 8));
//        Output: [1, 2, 3, 4, 5, 6, 7, 8]

        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5), Arrays.asList(6, 7, 8));

        List<Integer> flattenList = nestedList.stream().flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(flattenList);

    }
}
