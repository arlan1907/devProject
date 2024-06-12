package oop.inheritance.vehicle;

public class Bus extends Vehicle{

    public String getInfo(){
        String info = "model: "+model+", Color: "+color+", make: "+make;
        return info;
    }
}
