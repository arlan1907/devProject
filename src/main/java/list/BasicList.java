package list;

import java.util.ArrayList;
import java.util.List;

public class BasicList {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("John");
        list.add(123);
        list.add(2.55);
        list.add(true);
        list.add('b');

        list.set(0, "Patel");
        System.out.println(list);

        list.remove(Character.valueOf('b'));
        System.out.println(list);

        list.remove(list.indexOf("Patel"));
        System.out.println(list);

        List sublist = list.subList(1, 3);
        System.out.println(sublist);

        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());


    }
}
