package oop.inheritance.flyVehicle;

import oop.inheritance.vehicle.Vehicle;

public class Plane extends Vehicle {
    public String getInfo(){
        String info = "model: "+model+", Color: "+color;
        return info;
    }
}
