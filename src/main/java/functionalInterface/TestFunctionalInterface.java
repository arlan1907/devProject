package functionalInterface;

public class TestFunctionalInterface {
    public static void main(String[] args) {

        Printer p =
            (str) -> System.out.println("Printing: " + str);

        p.print("Message");
        p.print("John");


        Printer p2 = (str) -> System.out.println("Running: " + str);

        p2.print("Patel");
        p2.print("Ramesh");

        System.out.println("####################################");

        Calculator add = (a, b) -> a+b;
        System.out.println("adding " +add.calculate(4,5));

        Calculator multiple = (a, b) -> a*b;
        System.out.println("multiple "+multiple.calculate(2,3));

        Calculator divide = (a, b) -> a/b;
        System.out.println("divide "+divide.calculate(6,2));

        Calculator minus = (a, b) -> a-b;
        System.out.println("minus "+minus.calculate(5,3));


    }
}
