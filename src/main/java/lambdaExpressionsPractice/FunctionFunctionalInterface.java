package lambdaExpressionsPractice;

import lambdaExpressions.Car;

import java.util.function.Function;

public class FunctionFunctionalInterface {

    /**
     * Represents a function that accepts one argument and produces a result.
     */

    public static void main(String[] args) {
        // get parameter int and return boolean
        Function<Integer, Boolean> validate = x -> x>=18;
        System.out.println(validate.apply(20));


        // get String name and return initials as a string
        Function<String, String> getInitials = x -> {
            char firstI = x.charAt(0);
            char lastI = x.charAt(x.indexOf(" ")+1);
            return ""+firstI+lastI;
        };
        System.out.println(getInitials.apply("John Doe"));
        System.out.println(getInitials.apply("Donkey Kong"));

        // get data from Car clas , check if car is brand new
        Function<Car, Boolean> isBrandNew = x -> x.getYear()==2024;
        Car car = new Car("Toyota", 2024,"Black","SUV");
        System.out.println(isBrandNew.apply(car));
    }
}
