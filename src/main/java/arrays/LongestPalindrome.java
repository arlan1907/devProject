package arrays;

public class LongestPalindrome {
    public static void main(String[] args) {

        String[] str = {"civic", "kayak", "mom", "racecar"};
        int longest = 0;

        int a = 0;
        int b = str.length-1;

        for (int i = 0; i < str.length; i++) {

        while (a < b) {
            if (str[i].charAt(a) != str[i].charAt(b)) {
                i++;
            }
            a++;
            b--;
        }
        if (str[i].length() > longest) longest = str.length;
            System.out.println(str);
        }
        System.out.println(longest);
    }
}
