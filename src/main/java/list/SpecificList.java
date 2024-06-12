package list;

import java.util.ArrayList;
import java.util.List;

public class SpecificList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(16);
        list.add(24);
        list.add(33);

        System.out.println(list);

        // Print sum of odd numbers
        int sum =0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2!=0){
                sum+=list.get(i);
            }
        }
        System.out.println(sum);






    }
}
