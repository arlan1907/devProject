package arrays;

import java.util.Arrays;

public class MostRepeatedNumber {
    public static void main(String[] args) {

        int[] nums = {3,3,4,2,4,4,2,4,4};

        Arrays.sort(nums);

        int mostRepeatedNumber = nums[0]; //initially I will decide most repeated  number is in index 1.
        int maxCount = 1;                // I'm guessing there is no any repeated number at all
        int currentNumber = nums[0];      // I will start wit number in index 0
        int currentCount = 1;            // and the current index decided start from 1

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentNumber) {         // if number in index 1 is equal to number in index 0
                currentCount++;                     // then increase curentCount
            } else {
                currentNumber = nums[i];            // else number in the current index would be my current number and it is repeated starting from 1
                currentCount = 1;
            }

            if (currentCount > maxCount) {          // now if max count is equal to 1 at the beggingn and if current count is greater that that
                mostRepeatedNumber = currentNumber;  // repeted number equal to current number
                maxCount = currentCount;             // so max count equal to current number
        }
        }

        System.out.println(mostRepeatedNumber);





    }


}
