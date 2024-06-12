package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("C#");
        list.add("C++");

        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());

        list.set(2,"TypeScript");
        list.add(1,"JavaScript");
    }
}
