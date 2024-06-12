package exceptionprictice;

public class CustomException extends Exception{
    public CustomException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            checkValue(0);
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    public static void checkValue(int value) throws CustomException {
        if (value == 0) {
            throw new CustomException("Value cannot be zero");
        }
    }
}
