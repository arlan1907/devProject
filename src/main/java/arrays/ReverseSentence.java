package arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "I love Java";

        // Java love I

        String[] splitted = sentence.split(" ");

        for (int i = splitted.length-1; i >=0 ; i--) {
            System.out.print(splitted[i]+" ");

        }


    }
}
