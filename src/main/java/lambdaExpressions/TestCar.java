package lambdaExpressions;

import java.util.List;
import java.util.Objects;

public class TestCar {
    public static void main(String[] args) {

    Car car1 = new Car("Toyota", 2020, "White", "Sedan");
    Car car2 = new Car("Honda", 2024, "Red", "SUV");
    Car car3 = new Car("Mercedes", 2022, "Black", "Sedan");
    Car car4 = new Car("BMW", 2018, "Silver", "SUV");
    Car car5 = new Car("Chevrolet", 2015, "Blue", "SUV");

    List<Car> cars = List.of(car1, car2, car3, car4, car5);

    /*
    get cars model that is 2020 and newer
     */

//    for(Car c : cars){
//        if(c.getYear()>=2020){
//            System.out.println(c.getModel());
//        }
//    }
    getDataFromCars(cars, car -> car.getYear()>=2020, Car::getModel);

    /*
    get colors of SUV cars
     */

//        for(Car c : cars){
//            if(c.getType().equals("SUV")){
//                System.out.println(c.getColor());
//            }
//        }
        getDataFromCars(cars, car -> car.getType().equals("SUV"), Car::getColor);

        getDataFromCars(cars, car -> car.getType().equals("Sedan"), car -> car.getYear());

        getDataFromCars(cars, car -> car.getYear()%2==0 && car.getType().equals("SUV"),car -> car.getModel().substring(0,3).toUpperCase());

        System.out.println("Count of SUV cars : " + getCountOfCars(cars, car -> car.getType().equals("SUV")));
        System.out.println("Count of Sedan cars : " + getCountOfCars(cars, car -> car.getType().equals("Sedan")));
        System.out.println("Count of Black cars : " + getCountOfCars(cars, car -> car.getColor().equals("Black")));





    }

    public static void getDataFromCars(List<Car> cars, CarCondition condition, AttributeFunction<Object> function){
        for(Car c : cars){
            if(condition.apply(c)) {
                System.out.println(function.get(c));
            }
        }
    }

    public static int getCountOfCars(List<Car> cars, CarCondition condition){

        int count = 0;
        for(Car c : cars){
            if(condition.apply(c)){
                count++;
            }
        }
        return count;
    }
}
