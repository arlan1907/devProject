package lambdaExpressionsPractice;


import lambdaExpressions.Car;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    /**
     * takes one parameter and returns void
     */
    public static void main(String[] args) {
        Consumer<Car> printCarModel = x -> System.out.println(x.getModel());

        Car car = new Car("Lamba", 2025,"Blue","Sedan");

        printCarModel.accept(car);


    }
}
