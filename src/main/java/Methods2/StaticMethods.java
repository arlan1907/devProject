package Methods2;

public class StaticMethods {

    public static int getAverage(int[] nums){
        int sum = 0;

        for(int num : nums){
            sum+=num;
        }

        return sum/nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(getAverage(nums));
    }


}
