package arrays;

import java.util.Arrays;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        //        Write a code that finds duplicates in Array. (Array can have different values)
        int[] nums={4,3,2,7,8,2,3,1};

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]) System.out.println("Duplicate number is " + nums[i]);
        }
    }
}
