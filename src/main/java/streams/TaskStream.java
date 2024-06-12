package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskStream {

    public static void main(String[] args) {


        List<List<Integer>> numbers = new ArrayList<>();

        List<Integer> list1 = List.of(5,2,10,2);
        List<Integer> list2 = List.of(15,2,16);

        numbers.add(list1);
        numbers.add(list2);

        /*
        Add all number of list into single list only by multiplying each number by two only those that is less than 10
         */

        List<Integer> result = numbers.stream()
                .flatMap(list -> list.stream())
                .filter(x -> x<10)
                .map(x -> x*2)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
