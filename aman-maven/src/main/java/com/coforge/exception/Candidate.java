package com.coforge.exception;

public class Candidate {

    private String name;
    private String gender;
    private double expectedSalary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(double expectedSalary) throws InvalidSalaryException{
        if(expectedSalary < 10000){
            throw new InvalidSalaryException("Salary cannot be less than 10000");
        }
        this.expectedSalary = expectedSalary;
    }

    public static Candidate getCandidateDetail(Candidate candidate) throws InvalidSalaryException {
        candidate.setExpectedSalary(10000);
        candidate.setGender("M");
        candidate.setName("Abhishek");
        return candidate;
    }

    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        try{
            candidate.setName("Abhishek");
            candidate.setGender("M");
            candidate.setExpectedSalary(10000);
            System.out.println("Registration Successful");
        }
        catch (InvalidSalaryException e){
            System.err.println(e.getMessage());
        }

    }

}