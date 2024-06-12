package oop.inheritance.methods;

public class Child extends Parent{

    /*
    Inherited Methods:
    1. Final method
    2. Regular method
    3. Static method

    Methods can be overridden:
    1. Regular Method

    NonInherited Methods:
    1. Private Method
     */


    public static String staticMethod(){
        return "Static Method of Child Class";
    }

    @Override
    public String regularMethod(){
        return "Regular Method of Child Class";
    }

    private String privateMethod(){
        return "Private Method of Child Class";
    }



}
