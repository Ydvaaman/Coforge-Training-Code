package com.coforge.database;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDoa {
    Map<Integer, Employee> employeeMap;
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public EmployeeDoa() throws SQLException {
        employeeMap = new HashMap<>();

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","mysql");
    }
    public boolean addEmployee(Employee emp) throws SQLException{
        statement = connection.createStatement();
        int r= statement.executeUpdate("insert into employee values("+emp.getId()+",'"+emp.getName()+"',"+emp.getSalary()+")");
        if(r==1)
            return true;
        return false;
    }
    public Employee searchEmployeeById(int id) throws SQLException {
        Map<Integer,Employee> empMap = getAllEmployees();
        if(empMap.containsKey(id)){
            return empMap.get(id);
        }
        return null;
    }
    public HashMap<Integer,Employee> getAllEmployees() throws SQLException {
        resultSet = null;
        resultSet = statement.executeQuery("select * from employee");
        employeeMap = null;
        employeeMap = new HashMap<>();

        Employee employee;
        while (resultSet.next()) {
        } employee = new Employee();
        employee.setId(resultSet.getInt(1));
        employee.setName(resultSet.getString(2));
        employee.setSalary(resultSet.getFloat(3));

        employeeMap.put(employee.getId(), employee);
        return (HashMap<Integer, Employee>) employeeMap;

    }

}
