package stringBuilder;

public class StbMethods {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder("Computer");

        stb.insert(0, "Apple ");
        System.out.println(stb);

        stb.insert(6, "- ");
        System.out.println(stb);

        System.out.println(stb.reverse());

        stb.reverse();

        stb.delete(0,8);
        System.out.println(stb);

    }
}
