package com.example.projectandroid;

import java.util.Calendar;

public class Employee {

    private String firstName, lastName;
    private String employeeId;
    private String numberOfProjects;
    private int age;
    private String type;
    private String birthYear;
    private String monthlySalary;
    private String occupationRate;
    private Vehicle vehicle;


    public Employee(String firstName, String lastName, String employeeId, String numberOfProjects, int age, String type, String birthYear, String monthlySalary, String occupationRate, Vehicle vehicle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.numberOfProjects = numberOfProjects;
        this.age = age;
        this.type = type;
        this.birthYear = birthYear;
        this.monthlySalary = monthlySalary;
        this.occupationRate = occupationRate;
        this.vehicle = vehicle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getNumberOfProjects() {
        return numberOfProjects;
    }

    public void setNumberOfProjects(String numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }

    public String getOccupationRate() {
        return occupationRate;
    }

    public void setOccupationRate(String occupationRate) {
        int or = Integer.parseInt(occupationRate);
        if(or < 10)
            this.occupationRate = "10";
        else if (or > 100)
            this.occupationRate = "100";
        else
            this.occupationRate = occupationRate;

    }






    public Employee() {


    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(getBirthYear());
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(String monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

}

class Manager extends Employee{

    private String numberOfClients;
    private Vehicle vehicle;

    public Manager(String name, int age, String birthYear, String monthlySalary, String rate, String numberOfClients, Vehicle vehicle) {
        this.numberOfClients = numberOfClients;
        this.vehicle = vehicle;
    }
}

class Tester extends Employee{

    private String numberOfBugs;

    public Tester(String name, int age, String birthYear, String monthlySalary, String rate, String numberOfBugs) {
        this.numberOfBugs = numberOfBugs;
    }

    public String getNumberOfBugs() {
        return numberOfBugs;
    }

    public void setNumberOfBugs(String numberOfBugs) {
        this.numberOfBugs = numberOfBugs;
    }
}


class Programmer extends Employee{

    private String numberOfProjects;

    public Programmer(String name, int age, String birthYear, String monthlySalary, String rate, String numberOfProjects) {

        this.numberOfProjects = numberOfProjects;
    }

    public String getNumberOfProjects() {
        return numberOfProjects;
    }

    public void setNumberOfProjects(String numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }

    public String toString(){
        StringBuilder stringBuilder;
        return "";
    }

}

























