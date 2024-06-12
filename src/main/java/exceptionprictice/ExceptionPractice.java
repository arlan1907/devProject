package exceptionprictice;

public class ExceptionPractice {
    public static void main(String[] args) {

        String str = null;

        try{
            System.out.println(str.charAt(5));
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println("there was an exception");
            System.out.println(exception.getMessage());
            System.out.println(exception.getClass());
        }catch (NullPointerException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getClass());
        }

        System.out.println("End code");

    }
}
