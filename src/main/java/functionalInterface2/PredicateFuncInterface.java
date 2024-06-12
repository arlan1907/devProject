package functionalInterface2;

import java.util.function.Predicate;

public class PredicateFuncInterface {
    public static void main(String[] args) {


        Predicate<String> containsLetterA = x -> x.toLowerCase().contains("a");

        System.out.println(containsLetterA.test("Java"));
    }
}
