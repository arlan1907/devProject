package list;

import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] num = {2,6,4,10,2,3,10};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            if(!list.contains(num[i])){
                list.add(num[i]);
            }
        }
        System.out.println(list);
    }
}
