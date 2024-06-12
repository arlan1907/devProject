package exceptionprictice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isException = false;

        do{
            System.out.println("Enter two number");
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            try{
                int result = number1 / number2;
                System.out.println("Division of two number equals to " + result);
                break;
            } catch (ArithmeticException | InputMismatchException | NullPointerException exception){
                System.out.println(exception.getMessage());
                isException = true;
            }
        }while (isException);
    }
}
