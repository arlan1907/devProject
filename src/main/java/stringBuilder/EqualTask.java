package stringBuilder;

public class EqualTask {
    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("Apple");
        StringBuilder stb2 = new StringBuilder("apple");
        StringBuilder stb3 = new StringBuilder("Apple");

        System.out.println(stb1.equals(stb2));
        System.out.println(stb1.toString().equals(stb3.toString()));

        stb1=stb2;

        System.out.println(stb2.equals(stb1));
        System.out.println(stb1.toString().equals(stb3.toString()));
    }
}
