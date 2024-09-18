package com.coforge.database;

import java.sql.*;
import java.util.Scanner;

public class EmployeeDatabase {
    public static void main(String[] args) {
        try{
                                   //com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","mysql");
            if(connection!=null)
                System.out.println("connection is established");

            else
                System.out.println("some problem");
            Scanner scanner = new Scanner(System.in);
            Statement statement = connection.createStatement();
            System.out.println("Adding Record");
            System.out.println("Enter id name and salary");
            int id=scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            float sal=scanner.nextFloat();

            statement.executeUpdate("insert into employee values("+id+",'"+name+"',"+sal+")");

            ResultSet resultSet = statement.executeQuery("select * from employee");
            while(resultSet.next())
                System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getFloat(3));
            
        } catch (SQLException e) {
            System.err.println("sql error "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("drive is not present");
        }

        
    }
}
