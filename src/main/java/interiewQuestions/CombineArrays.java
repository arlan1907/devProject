package interiewQuestions;

import java.util.Arrays;

public class CombineArrays {

    /*
    Combine two arrays into one array. int nums[]={2,4,3}; int nums2[]={1,8};
     */

    public static void main(String[] args) {
        int[] nums ={2,4,3};
        int[] nums2 ={1,8};

        System.out.println(Arrays.toString(combineArrays(nums, nums2)));


    }

    public static int[] combineArrays(int nums[], int nums2[]){
        int[] combined = new int[nums.length+ nums2.length];
        int index = 0;

        // Copy elements from the second array
        //System.arraycopy(nums, 0, combined, 0, nums.length);
        //System.arraycopy(nums2, 0, combined, nums.length, nums2.length);

        for (int num : nums) {
            combined[index] = num;
            index++;
        }
        for (int j : nums2) {
            combined[index] = j;
            index++;
        }

        return combined;
    }
}
