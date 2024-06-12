package methods;

import java.util.Arrays;

public class HelpfulMethods {
    public static void main(String[] args) {

        HelpfulMethods helpfulMethods = new HelpfulMethods();
        System.out.printf("%.2f\n",helpfulMethods.convertToCelsius(90));
        System.out.printf("%.2f\n",helpfulMethods.convertToCelsius(100));
        System.out.printf("%.2f\n",helpfulMethods.convertToCelsius(110));

        System.out.println(helpfulMethods.trimLasTwo("Java"));
        System.out.println(helpfulMethods.trimLasTwo("Programming"));
        System.out.println(helpfulMethods.trimLasTwo("a"));

        System.out.println(helpfulMethods.canEvenlyDivide(5, 3));
        System.out.println(helpfulMethods.canEvenlyDivide(4, 2));

        System.out.println(helpfulMethods.ifLettersSame("Anna"));
        int[] nm = {1,2,3,4,5,6};
        System.out.println(helpfulMethods.arrayContainsValue(nm,6));

        int[] nm2 = {6,5,4,3,2,2};
        System.out.println(helpfulMethods.arraysContainsSameElements(nm, nm2));


    }

    public double convertToCelsius(int fahrenheit){
        return (fahrenheit-32)*5.0/9.0;
    }
    public String trimLasTwo(String word){
        int startIndex = Math.max(0, word.length() - 2);
        return word.substring(startIndex);
    }
    public boolean canEvenlyDivide(int num1, int num2){
        return num1%num2==0;
    }
    public boolean ifLettersSame(String word){
        return word.substring(0,1).equalsIgnoreCase(word.substring(word.length()-1));

    }

    public boolean arrayContainsValue(int[] nums, int number){
        for(int n:nums){
            if(n==number) return true;
        }
        return false;
    }

    public boolean arraysContainsSameElements(int[] nums1, int[] nums2){
        if (nums1.length != nums2.length)
            return false;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i])
                return false;
        }

        return true;
    }
}
