package collections.set;

import java.util.HashSet;

public class IntroHashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println(set.add(55));
        System.out.println(set.add(55));
        System.out.println(set.add(67));
        set.add(66);
        set.remove(66);
        set.remove(11);

        System.out.println(set);
    }


}
