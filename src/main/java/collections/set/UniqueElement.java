package collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(isUnique(nums));

    }

    public static boolean isUnique(int[] nums){

        Set<Integer> intSet = new HashSet<>();
        for (int num : nums) {
            intSet.add(num);
        }
//
//        Set<Integer> intSet = Arrays.stream(intArray)
//                .boxed()
//                .collect(Collectors.toCollection(HashSet::new));

        return nums.length==intSet.size();
    }
}
