package lambdaExpressionsPractice;

import java.util.function.BiConsumer;

public class BiConsumerInterface {

    /**
     * takes two parameter and return void
     */
    public static void main(String[] args) {


        BiConsumer<String, Integer> concatenate = (x,y) -> System.out.println(x+y);

        concatenate.accept("Java ", 21);
    }
}
