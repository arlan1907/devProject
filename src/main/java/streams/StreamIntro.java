package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntro {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,7,8,9,16);

        List<Integer> output = numbers.stream().filter(x -> x>0 && x<5).collect(Collectors.toList());
        List<Integer> output1 = numbers.stream().filter(x -> x%2==1).collect(Collectors.toList());
        Long output2 = numbers.stream().filter(x -> x%2==1).count();
        List<Integer> output3 = numbers.stream().distinct().collect(Collectors.toList());
        boolean anyMatch = numbers.stream().anyMatch(x -> x>10 && x<20);
        boolean allMatch = numbers.stream().allMatch(x -> x>0 && x<10);

        System.out.println("output = " + output);
        System.out.println("output1 = " + output1);
        System.out.println("output2 = " + output2);
        System.out.println("output3 = " + output3);
        System.out.println("anyMatch = " + anyMatch);
        System.out.println("allMatch = " + allMatch);


        String[] names = {"John", "Patel", "Bob", "Charles"};

        List<String> namesWithA = Arrays.stream(names).filter(x -> x.contains("a") || x.contains("A")).collect(Collectors.toList());
        System.out.println(Arrays.toString(namesWithA.toArray()));



    }
}
