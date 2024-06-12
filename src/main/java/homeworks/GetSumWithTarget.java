package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GetSumWithTarget {
    /*
    Write a method that has two parameters with array of ints and target int.
    If any of the integers are less than or equals to the target number, add those numbers to each other,
     provided they are unique (If the number duplicate, then add only once). Compare this sum to the target number.
     If this sum is greater than the target number,
     return an array with the sum of all the unique numbers that were less than or equal to the target number as well as true.
      Otherwise return the sum of all the numbers in the original array argument, as well as false.

Example:
int[] nums1={5, 2, 1, -5, -7, -14, 4, 3, 3} -> 2, 1 -5 -7 -14 3 =  -20
   .getOutput(nums1, 3); -> returns array of objects [-20, true]

int[] nums2={7, 8, 5, 1, -4, -4, 11, 6, 12, 1, 1, -12, 100}
   .getOutput(nums2, 10); -> returns array of objects [132, false]
     */

    public static Object[] getOutput(int[] num, int target){
        List<Integer> listOf = new ArrayList<>();  // I want to collect all unique values
        int uniqueOrLess = 0;
        int totalSum = 0;

        for (int i = 0; i < num.length; i++) {
            totalSum += num[i];
            if (num[i]<=target && !listOf.contains(num[i])){
                uniqueOrLess += num[i];
                listOf.add(num[i]);
            }
        }
        boolean greaterThanTarget = uniqueOrLess < target;
        if(greaterThanTarget){
            return new Object[]{uniqueOrLess, true};
        }else {
            return new Object[]{totalSum, false};
        }
    }

    public static void main(String[] args) {
        int[] nums1={5, 2, 1, -5, -7, -14, 4, 3, 3};
        int[] nums2={7, 8, 5, 1, -4, -4, 11, 6, 12, 1, 1, -12, 100};

        System.out.println(Arrays.toString(getOutput(nums1, 3)));
        System.out.println(Arrays.toString(getOutput(nums2, 10)));
    }
}
