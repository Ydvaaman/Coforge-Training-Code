package com.coforge.database;



import java.sql.SQLException;

import java.util.Collection;

import java.util.Map;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        String ch="y";

        try{

            Employee employee;

            EmployeeDoa employeeDao = new EmployeeDoa();

            Scanner sc = new Scanner(System.in);

            while (ch.equals("y")){

                System.out.println("1.Add Record");

                System.out.println("2.Search Record");

                System.out.println("3.Show all records");

                int op = sc.nextInt();

                switch (op){

                    case 1:

                        System.out.println("Enter id name and salary");

                        int id = sc.nextInt();

                        sc.nextLine();

                        String name = sc.nextLine();

                        float sal = sc.nextFloat();

                        employee = null;

                        employee = new Employee();

                        employee.setId(id);

                        employee.setName(name);

                        employee.setSalary(sal);

                        employeeDao.addEmployee(employee);

                        break;

                    case 2:
                        id = 0;

                        System.out.println("Enter Id ");

                        if(employeeDao.searchEmployeeById(id) == null){

                            System.out.println("Id not found");

                        }

                        else{

                            employee = null;

                            employee = employeeDao.searchEmployeeById(id);

                            System.out.println("Id found " +employee);

                        }


                        break;

                    case 3:

                        System.out.println("All Records");

                        Map<Integer,Employee> allEmployees = employeeDao.getAllEmployees();

                        Collection<Employee> values = allEmployees.values();

                        for(Employee e:values){

                            System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());

                        }

                        break;

                    default:

                        System.out.println("invalid choice");

                }
                System.out.println("continue y\\n");
                ch = sc.next();
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }

    }

}

