package constractors;

public class CarDealership {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota",2022,"Black");
        Car car2 = new Car("Honda",2024,"White");
        Car car3 = new Car();

        System.out.println(car3.model);



    }
}
