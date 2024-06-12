package stringBuilder;

import java.util.Arrays;

public class stbPractice {
    public static void main(String[] args) {
        StringBuilder[] stb = {new StringBuilder("John Doe"), new StringBuilder("Patel Harsh"), new StringBuilder("Kim Yan")};


        for (int i = 0; i < stb.length; i++) {
            stb[i].insert(stb[i].indexOf(" ")+1, " ");


        }
        for (StringBuilder sb : stb) {
            sb.insert(sb.indexOf(" "), " -");
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == 'a') {
                    sb.setCharAt(i, 'o');
                }
                if (sb.charAt(i) == 'e') {
                    sb.setCharAt(i, 'i');
                }
            }
        }
        System.out.println(Arrays.toString(stb));

    }
}
