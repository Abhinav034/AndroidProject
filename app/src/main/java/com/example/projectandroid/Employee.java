package com.example.projectandroid;

public class Employee {

    private String name;
    private int age;
    private String birthYear;
    private String monthlySalary;
    private String rate;
    private Vehicle vehicle;


    public Employee(String name, int age, String birthYear, String monthlySalary, String rate) {
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
        this.monthlySalary = monthlySalary;
        this.rate = rate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
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

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}

class Manager extends Employee{

    private String numberOfClients;
    private Vehicle vehicle;

    public Manager(String name, int age, String birthYear, String monthlySalary, String rate, String numberOfClients, Vehicle vehicle) {
        super(name, age, birthYear, monthlySalary, rate);
        this.numberOfClients = numberOfClients;
        this.vehicle = vehicle;
    }
}

class Tester extends Employee{

    private String numberOfBugs;

    public Tester(String name, int age, String birthYear, String monthlySalary, String rate, String numberOfBugs) {
        super(name, age, birthYear, monthlySalary, rate);
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
        super(name, age, birthYear, monthlySalary, rate);
        this.numberOfProjects = numberOfProjects;
    }

    public String getNumberOfProjects() {
        return numberOfProjects;
    }

    public void setNumberOfProjects(String numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }
}

























