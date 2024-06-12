package arrays;

public class CountValuesInArray {
    public static void main(String[] args) {
        int[] nums = {10,25,10,1,25,1,1,1,5,5,25};

        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int pennies = 0;
        int sum = 0;
        int dollars = 0;
        int cents = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 25) quarter++;
            else if (nums[i] == 10) dime++;
            else if (nums[i] == 5) nickel++;
            else pennies++;
            sum += nums[i];
        }
        System.out.println("quarter = " +quarter+ " dime = "+ dime + " nickels = "+ nickel + " pennies = " + pennies);
        System.out.println(sum);
        if(sum<100){
            System.out.println(dollars + " dollars" + ", " + sum + " cents");}
        else {
            dollars = sum/100;
            cents = sum%100;
            System.out.println(dollars + " dollars" + ", " + cents + " cents");
        }

    }


}
