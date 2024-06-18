package interiewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ReverseSentenceWithSpace {

    /*
    Write a code that will reverse sentence; String str="I like USA";  Output:"A SUek ilI";
     */
    public static void main(String[] args) {
        String str="I like USA";
        System.out.println(reverseSentence(str));

    }
    public static String reverseSentence(String str){

        StringBuilder stb = new StringBuilder();
        List<Integer> spacePositions = new ArrayList<>();  // 1, 6

        //Remove spaces and record their positions
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) { // if(str.charAt(i) == ' ')
                spacePositions.add(i);
            } else {
                stb.append(str.charAt(i));
            }
        }
        System.out.println(spacePositions);
        // IlikeUSA
        System.out.println("initial string without spaces " + stb);

        stb.reverse();
        //A SUek ilI
        //Insert spaces back at the recorded positions
        for (int position : spacePositions) {
            if (position <= stb.length()) {
                stb.insert(position, ' ');
            }
        }
        return stb.toString();
    }
}
