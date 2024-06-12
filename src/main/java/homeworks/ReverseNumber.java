package homeworks;

public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println(reverseInt(123));
        System.out.println(reverseInt(-123));
        System.out.println(reverseInt(200));

    }
    public static int reverseInt(int num){
        int reverse = 0;
        boolean negative = num<0;
        if(negative) num = num*-1;

        while (num>0){
                int remainder = num%10;
                reverse=reverse*10+ remainder;
                num/=10;
            }
            if(negative) reverse=reverse*-1;
            return reverse;
        }
    }


