package com.example.projectandroid;

public class Vehicle {
    private String make;
    private String model;
    private String plate;
    private String color;
    private String category;


    public Vehicle(String make, String plate, String color, String category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    public Vehicle() {


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

class Car extends Vehicle {

    public Car() {
    }

    private String type;

    public Car(String make, String plate, String color, String category, String type) {

        super(make, plate, color, category);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Motorcycle extends Vehicle {

    private boolean sidecar;

    public Motorcycle() {

    }

    public Motorcycle(String make, String plate, String color, String category, boolean sidecar) {
        super(make, plate, color, category);
        this.sidecar = sidecar;
    }


    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }
}