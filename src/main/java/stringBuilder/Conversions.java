package stringBuilder;

public class Conversions {
    public static void main(String[] args) {
        String str = "computer";
        StringBuilder stb = new StringBuilder(str);

        String str2 = stb.toString();

        System.out.println(new StringBuilder(str2.toUpperCase()).reverse());
    }
}
