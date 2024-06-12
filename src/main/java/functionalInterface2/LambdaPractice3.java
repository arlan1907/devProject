package functionalInterface2;

public class LambdaPractice3 {

    public static void main(String[] args) {

        Condition<String> containsLetterA = x -> x.toLowerCase().contains("a");
        System.out.println(containsLetterA.execute("Book"));

        Condition<Integer> isEven = x -> x%2==0;
        System.out.println(isEven.execute(50));

        Condition<Character> isLowerCase = x -> Character.isLowerCase(x);
        System.out.println(isLowerCase.execute('B'));

        Condition<String> isPalindrome = x -> new StringBuilder(x).reverse().toString().equalsIgnoreCase(x);
        System.out.println(isPalindrome.execute("madam"));






    }
}
