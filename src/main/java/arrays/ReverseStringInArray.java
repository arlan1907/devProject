package arrays;

public class ReverseStringInArray {
    public static void main(String[] args) {
        /*
        String[] words={“Hi”, “java”, “String”};
        Reassign each value of array with reversed word. Then print that array.

         */

        String[] words = {"Hi","java","String"};

        for (int i = 0; i < words.length; i++) {
            StringBuilder st = new StringBuilder(words[i]).reverse();
            System.out.print(st +" ");

        }
    }
}
