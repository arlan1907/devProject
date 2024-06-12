package oop.inheritance.flyVehicle;

import oop.inheritance.vehicle.Bus;
import oop.inheritance.vehicle.Vehicle;

public class TestVehicles {
    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println(bus.getInfo());

        Plane plane = new Plane();
        System.out.println(plane.getInfo());

        Vehicle vehicle = new Vehicle();
        vehicle.model = "Toyota";




    }
}
