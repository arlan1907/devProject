package oop.inheritance.methods;

public class TestMethods {

    public static void main(String[] args) {
        Child child = new Child();

        System.out.println(child.staticMethod());
        System.out.println(child.finalMethod());
        System.out.println(child.regularMethod());

    }
}
