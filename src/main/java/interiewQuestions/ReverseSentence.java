package interiewQuestions;

public class ReverseSentence {
    /*
    Write a code that will reverse sentence. String str=”String is immutable”; output: “immutable is String“;
     */

    public static void main(String[] args) {
        String str="String is immutable";
        System.out.println(reverseSentence(str));



    }

    public static String reverseSentence(String str){
        String[] split = str.split(" ");
        StringBuilder stb = new StringBuilder();

        for (int i = split.length-1; i >= 0 ; i--) {
            stb.append(split[i]).append(" ");
        }
        return stb.toString().trim();
    }
//    public static String reverseWords(String sentence) {
//        // Split the sentence into words
//        List<String> words = Arrays.asList(sentence.split(" "));
//
//        // Use streams and lambda to reverse the order of words and collect them into a new sentence
//        String reversed = words.stream()
//                .collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {
//                    Collections.reverse(lst);
//                    return lst.stream();
//                }))
//                .collect(Collectors.joining(" "));
//
//        // Return the reversed sentence
//        return reversed;
//    }

}
