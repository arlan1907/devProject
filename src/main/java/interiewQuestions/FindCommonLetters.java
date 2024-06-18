package interiewQuestions;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonLetters {
    /*
    Find common letters of Strings in array.
        input: String[] values={“sun“,”fun”,”cut”}; → returns “u“
        All letters contains letter 'u'
     */

    public static void main(String[] args) {
        String[] values={"suni","funi","cuti"};
        System.out.println("Common letters " + commonLetters(values));

    }
public static String commonLetters(String[] words){
    Set<Character> commonSet = new HashSet<>();

    for(char c : words[0].toCharArray()){
        commonSet.add(c);
    }
    // Initialize the common set with characters from the first word
//    Set<Character> commonSet = words[0].chars()
//            .mapToObj(c -> (char) c)
//            .collect(Collectors.toSet());

    for (String word : words) {
        Set<Character> currentSet = new HashSet<>();
        for (char c : word.toCharArray()) {
            currentSet.add(c);
        }
        commonSet.retainAll(currentSet);
    }

    StringBuilder commonLetters = new StringBuilder();
    for (char c : commonSet) {
        commonLetters.append(c).append(" ");
    }
    return commonLetters.toString().trim();
}

}
