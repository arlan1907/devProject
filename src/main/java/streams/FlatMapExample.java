package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {

        List<List<Integer>> listOfList = new ArrayList<>();
        List<Integer> list1 = List.of(4,5,1);
        List<Integer> list2 = List.of(3,2);

        listOfList.add(list1);
        listOfList.add(list2);

        System.out.println(listOfList);

        List<Integer> numbers = listOfList.stream()      // streams parent list
                .flatMap(list -> list.stream())         // streams each list
                .sorted()                               // will sort the list
                .collect(Collectors.toList());          // collect lists values

        System.out.println(numbers);

        String[] values = {"Today, I have", "learned streams", "and different operations"};
        // want to see each word separately

        List<String> words = Arrays.stream(values)
                .flatMap(element -> Arrays.stream(element.split(" ")))  // element.split("," -> array os strint
                .collect(Collectors.toList());








    }
}
