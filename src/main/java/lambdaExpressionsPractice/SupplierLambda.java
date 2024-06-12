package lambdaExpressionsPractice;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierLambda {

    public static void main(String[] args) {

        //generates Random integer value
        Supplier<Integer> generateRandomNumber = () -> {
            Random random = new Random();
            return random.nextInt();
        };

        System.out.println(generateRandomNumber.get());

        //generates Random String value
        Supplier<String> generateRandomStr = () -> {
            String str = UUID.randomUUID().toString();
            return str;
        };

        System.out.println(generateRandomStr.get());
    }

}
