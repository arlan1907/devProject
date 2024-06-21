package collections.set;

import java.util.Set;
import java.util.TreeSet;

public class IntroTreeSet {

    public static void main(String[] args) {
        Set<String> treSet = new TreeSet<>();
        treSet.add("Bebra");
        treSet.add("Java");
        treSet.add("Apple");
        treSet.add("Zebra");

        System.out.println(treSet);
    }
}
