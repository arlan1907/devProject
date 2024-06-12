package lambdaExpressionsPractice;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class JavaLibraryFunctions {
    public static void main(String[] args) {

        Supplier<Integer> generateRandomNum = () -> {
            Random random = new Random();
            return random.nextInt();
        };
        System.out.println(generateRandomNum.get());

        Supplier<String> generateRandomStr = () -> {
            String str = UUID.randomUUID().toString();
            return str;
        };

        System.out.println(generateRandomStr.get());
    }
}
