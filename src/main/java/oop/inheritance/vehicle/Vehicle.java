package oop.inheritance.vehicle;

public class Vehicle {
    public String model;
    protected String color;
    String make;
    private int year;

    public String drive(){
        return "Vehicle is driving";
    }

    protected String stop(){
        return "Vehicle is stopping";
    }

    String start(){
        return "Vehicle ist starting";
    }

    private String part(){
        return "Vehicle is parking";
    }

}
