package wrapperclass;

public class ReverseNumber {
    public static void main(String[] args) {

        int number = -123;
        // 123 ->321

        StringBuilder str = new StringBuilder(String.valueOf(Math.abs(number))).reverse();

        number=Integer.parseInt(str.toString())*-1;
        System.out.println(number);
    }
}
