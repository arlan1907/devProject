package interiewQuestions;

public class LargestElementOfArray {
    /*
    Write a code to find largest number in Array without using sort method. int[] nums={5,3,8,1,9};
     */
    public static void main(String[] args) {
        int[] nums={5,3,8,1,9};
        int[] nums1={};
        int[] nums2={0};
        System.out.println(largestElement(nums));
        System.out.println(largestElement(nums1));
        System.out.println(largestElement(nums2));

    }

    public static int largestElement(int[] numbers){
        int largest;
        if(numbers.length>0) {
          largest = numbers[0];
            for (int number : numbers) {
                if (number > largest) {
                    largest = number;
                }
            }
        }else{
            return -1;
        }
        return largest;
    }
}
