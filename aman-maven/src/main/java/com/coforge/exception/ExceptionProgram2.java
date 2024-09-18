package com.coforge.exception;

public class ExceptionProgram2 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        int ar[]={11,2,3,4,};
        try{
            System.out.println("5 elements "+ar[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("wrong index error");
        }
        try{
            System.out.println("result is "+(10/0));
        }
        catch(ArithmeticException e){
            System.out.println("divided by zero error"+e);
        }
        catch (Exception e){
            System.out.println("some other error" +e);
        }
        System.out.println("program ends ");
    }
}
