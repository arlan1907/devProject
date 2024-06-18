package interiewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    /*
    Write a code that counts number of letters in String? String str=”Java”; output: J=1, a=2, v=1
     */
    public static void main(String[] args) {
        String str="Java";
        String str1="Mindtek is the best tech school";
        System.out.println(countLetters(str));
        System.out.println(countLetters(str1));

    }
    public static Map<Character,Integer> countLetters(String str){
        Map<Character,Integer> count = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(!Character.isWhitespace(str.charAt(i))){
                if(!count.containsKey(str.charAt(i))){
                    count.put(str.charAt(i), 1);
                }else {
                    count.put(str.charAt(i), count.get(str.charAt(i))+1);
                }
            }
        }
return count;
    }
}
