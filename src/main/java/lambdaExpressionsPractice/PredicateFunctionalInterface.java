package lambdaExpressionsPractice;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    /**
     * Predicate -   Takes one parameter and returns boolean
     * BiPredicate - Takes two parameter and returns boolean
     */

    public static void main(String[] args) {


        Predicate<String> containsA = x -> x.toLowerCase().contains("a");
        System.out.println(containsA.test("Java"));
        System.out.println(containsA.test("Python"));



        BiPredicate<String, String> isAnagram = (x,y) -> {
            char[] xLetters = x.toLowerCase().toCharArray();
            char[] yLetters = y.toLowerCase().toCharArray();

            Arrays.sort(xLetters);
            Arrays.sort(yLetters);

            return Arrays.toString(xLetters).equals(Arrays.toString(yLetters));
        };

        System.out.println(isAnagram.test("abcd","dcba"));
        System.out.println(isAnagram.test("abcd","java"));
        System.out.println(isAnagram.test("Java","java"));
    }
}
