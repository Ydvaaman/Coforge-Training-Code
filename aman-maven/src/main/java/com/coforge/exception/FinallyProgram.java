package com.coforge.exception;

import java.util.Scanner;

public class FinallyProgram {

    String fullName(String fname, String lname){

        if(fname.length() < 5){

            throw new RuntimeException("Invalid fname");

        }

        else if(lname.length() < 5){

            throw new RuntimeException("Invalid fname");

        }


        else{

            return fname+ " " +lname;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fn, ln;

        try{

            System.out.println("Enter First Name > 5 character");

            fn = sc.next();

            System.out.println("Enter Last Name > 5 character");

            ln = sc.next();

            System.out.println("Full Name is " + new FinallyProgram().fullName(fn, ln));

        }

        catch (RuntimeException e){

            System.err.println(e.getMessage());

        }

        finally {

            System.out.println("Finally Called");

            sc.close();

        }

    }

}

