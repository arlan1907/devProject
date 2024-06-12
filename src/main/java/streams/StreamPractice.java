package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {

        List<String> colors = List.of("Red", "Blue", "White", "Black", "Green", "Pink");

        Stream<String> stream = colors.stream();

        Stream<String> sortedColors = stream.filter(color -> color.startsWith("B")).sorted();

        List<String> output = sortedColors.filter(color -> color.contains("a")).collect(Collectors.toList());

        System.out.println(output);

        List<Integer> lengths =  colors.stream()
                .map(color -> color.length())
                .collect(Collectors.toList());
        System.out.println("length "+lengths);

        boolean result = colors.stream()
                .filter(color -> color.length()==5)
                .anyMatch(color -> color.toLowerCase().contains("b"));

        System.out.println(result);


        Integer max = colors.stream()
                .map(x -> x.length())
                .max(Integer :: compareTo).get();

        System.out.println("Max length " + max);

        Integer min = colors.stream()
                .map(x -> x.length())
                .min((x,y) -> x.compareTo(y)).get();

        System.out.println("Min length " + min);


    }
}
