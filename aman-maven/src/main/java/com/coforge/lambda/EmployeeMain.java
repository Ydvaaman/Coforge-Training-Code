package com.coforge.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class EmployeeMain {
    public static void main(String[] args) {
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
            }
        };
        Comparator<Employee> comparator1 = (a1,a2)-> a1.getName().compareTo(a2.getName());
        Comparator<Employee> comparator2 = (a1,a2)-> Float.valueOf(a1.getSalary()).compareTo(Float.valueOf(a2.getSalary()));
        Comparator<Employee> comparator3 = (a1,a2)-> Float.valueOf(a2.getSalary()).compareTo(Float.valueOf(a1.getSalary()));
        Employee employee[] = new Employee[3];
        employee[0] = new Employee(1001,"amit kumar",20000);
        employee[1] = new Employee(1003,"deepak kumar",15000);
        employee[2] = new Employee(1004,"arun kumar",50000);

        Arrays.sort(employee,comparator);
        System.out.println("sorted by id");
        for(Employee e:employee)
            System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());

        Arrays.sort(employee,comparator1);
        System.out.println("sorted by name ");
        for(Employee e: employee)
            System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());

        Arrays.sort(employee,comparator2);
        System.out.println("\nsorted by salary in ascending order ");
        for(Employee e: employee)
            System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());



        Arrays.sort(employee,comparator3);
        System.out.println("\nsorted by salary in descending order ");
        for(Employee e: employee)
            System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());

    }
}
