package com.coforge.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        Employee employee[] = new Employee[3];
        employee[0] = new Employee(10001,"amit kumar",20000);
        employee[1] = new Employee(10002,"deepak kumar",15000);
        employee[2] = new Employee(10003,"arun kumar",30000);

        List<Employee> empList = new ArrayList<>(Arrays.asList(employee));

        System.out.println(empList.size());
        empList.forEach(a-> System.out.println(a));
        System.out.println("\n");
        empList.stream().forEach(a-> System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getSalary()));
        System.out.println("\n emplist salary=10000");

        empList.stream().filter(a->a.getSalary()>10000).forEach(a-> System.out.println(a.getId()+"\t"+a.getName()
        +"\t"+a.getSalary()));

    }
}
