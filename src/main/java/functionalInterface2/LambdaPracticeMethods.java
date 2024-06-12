package functionalInterface2;

import functionalInterface2.MethodCondition;

import java.util.ArrayList;
import java.util.List;

public class LambdaPracticeMethods {

    /*
    String str = "Java"
    .getTotalWithCondition(str, getOnlyUpperCases); -> return "J"
     */

    public static String getOutputWithCondition(String str, MethodCondition<Character> condition){
        String output = "";
        for (int i = 0; i < str.length(); i++) {

            if(condition.execute(str.charAt(i))){
                output += str.charAt(i);
            }
        }
        return output;
    }

    public static List<Integer> getNumsWithCondition(List<Integer> nums, MethodCondition<Integer> condition){

        List<Integer> output = new ArrayList<>();

        for (Integer num : nums) {
            if(condition.execute(num)){
            output.add(num);}
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(getOutputWithCondition("Java", x -> Character.isUpperCase(x)));
        System.out.println(getOutputWithCondition("Java", x -> Character.isLowerCase(x)));
        System.out.println("Get Vowels : ");
        System.out.println(getOutputWithCondition("Java", x ->"ioueaIOUEA".contains(x+"")));



        List<Integer> numbers = List.of(5,6,1,21,16,42);
        System.out.println(getNumsWithCondition(numbers, x-> x%2==0));
        System.out.println("even numbers between 10 and 20");
        System.out.println(getNumsWithCondition(numbers, x -> x%2==0 && x>=10 && x<=20));
    }

}
