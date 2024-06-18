package lambdaExpressionsPractice;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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

//    public static String reverseWords(String sentence) {
//        // Split the sentence into words
//        List<String> words = Arrays.asList(sentence.split(" "));
//
//        // Use streams and lambda to reverse the order of words and collect them into a new sentence
//        String reversed = words.stream()
//                .collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {
//                    Collections.reverse(lst);
//                    return lst.stream();
//                }))
//                .collect(Collectors.joining(" "));
//
//        // Return the reversed sentence
//        return reversed;
//    }
}
