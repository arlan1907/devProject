package collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class IntroHashMap {
    public static void main(String[] args) {
        Map<Integer, String> days = new HashMap<>();
        days.put(2, "Tuesday");
        days.put(7, "Sunday");
        days.put(5, "Friday");
        System.out.println(days);

        System.out.println(days.get(5));
        System.out.println(days.remove(77));
        System.out.println();

    }


}
