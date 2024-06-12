package stringBuilder;

public class EqualsTask {
    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("Java");
        StringBuilder stb2 = new StringBuilder("Java");
        String str1 = new String("Java");
        String str2 = stb1.toString();

        System.out.println(stb1.toString().equals(str1));
        System.out.println(stb1.equals(stb2));
        System.out.println(str1.equals(str2));

        stb2=stb1;

        System.out.println(stb1.equals(stb2));


    }
}
