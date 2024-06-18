package interiewQuestions;

public class ReverseNumber {
    /*
    Write a code that reverses the number without converting it to StringBuilder and String. int num=6253; output should be 3526
     */
    public static void main(String[] args) {
        int num = 6253;
        System.out.println(reverseNumber(num));

    }
    public static int reverseNumber(int number){
        int reversed = 0;
        int remainder = 0;

        while (number>0){
            remainder = number%10;
            reversed = reversed*10+remainder;
            number/=10;
        }
        return reversed;
    }
}
