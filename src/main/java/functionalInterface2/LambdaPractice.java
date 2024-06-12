package functionalInterface2;

public class LambdaPractice {
    public static void main(String[] args) {

        StringManipulation strManu = str ->  str.toUpperCase();
        System.out.println(strManu.execute("java"));

        StringManipulation strMap = x -> ""+x.charAt(0)+x.charAt(x.length()-1);
        System.out.println(strMap.execute("Mindtek"));
    }
}
