package homeworks;

import java.util.Arrays;

public class FindTarget {
    /*
    Write a method that accepts 2 parameters. First parameter is Array of integers and second parameter is target number.
    Method should return array of three integers that sum equal to target number. Return null if array has less than 3 numbers.

Example:
.findTarget([], 12); returns [3,1,8]
.findTarget([2,1], 3); returns null
.findTarget([4,2,1,9,6,7], 9); returns [2,1,6]

     */
    public static void main(String[] args) {

        int[] nums = {4,2,1,9,6,7};
        System.out.println(Arrays.toString(findTarget(nums, 9)));

    }

    public static int[] findTarget(int[] nums, int target){
        if(nums.length<3)return null;
        
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;
            while(left< right){
                int sum = nums[i] + nums[left]+ nums[right];

                if(sum == target){
                    return new int[]{nums[i], nums[left], nums[right]};
                } else if (sum<target) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return null;
    }
}
